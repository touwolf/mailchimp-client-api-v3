package com.touwolf.mailchimp.api.batch;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.batch.BatchCreateRequest;
import com.touwolf.mailchimp.model.batch.BatchReadResponse;
import com.touwolf.mailchimp.model.batch.BatchResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

@Component
public class Batch {
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public Batch builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<BatchResponse> create(BatchCreateRequest request) throws MailchimpException {
        String payload = GSON.toJson(request);
        return builder.post("/batches", payload, BatchResponse.class);
    }

    public MailchimpResponse<BatchReadResponse> read(String fields, String excludeFields, Integer count, Integer offset) throws MailchimpException {
        String url = "/batches";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);
        url = MailchimpUtils.formatQueryString(url, "count", count);
        url = MailchimpUtils.formatQueryString(url, "offset", offset);


        return builder.get(url, BatchReadResponse.class);
    }

    public MailchimpResponse<BatchResponse> read(String batchId, String fields, String excludeFields) throws MailchimpException {
        if (StringUtils.isBlank(batchId)) {
            throw new MailchimpException("The field batch_id is required");
        }

        String url = "/batches/" + batchId;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, BatchResponse.class);
    }

    public MailchimpResponse<Void> delete(String batchId) throws MailchimpException {
        if (StringUtils.isBlank(batchId)) {
            throw new MailchimpException("The field batch_id is required");
        }

        String url = "/batches/" + batchId;
        return builder.delete(url, Void.class);
    }
}
