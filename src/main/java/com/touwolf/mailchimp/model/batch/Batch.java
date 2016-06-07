package com.touwolf.mailchimp.model.batch;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.batch.data.BatchCreateRequest;
import com.touwolf.mailchimp.model.batch.data.BatchResponse;
import org.bridje.ioc.Component;

@Component
public class Batch
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public Batch builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<BatchResponse> create(BatchCreateRequest request) throws MailchimpException
    {
        String payload = GSON.toJson(request);
        return builder.post("/batches", payload, BatchResponse.class);
    }
}
