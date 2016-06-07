package com.touwolf.mailchimp.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.model.list.ListsReadRequest;
import com.touwolf.mailchimp.model.list.ListsReadResponse;
import com.touwolf.mailchimp.model.list.ListsRequest;
import com.touwolf.mailchimp.model.list.ListsResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * A MailChimp list is a powerful and flexible tool that helps you manage your contacts. Learn how to get started with lists in MailChimp.
 */
@Component
public class Lists
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public Lists builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<ListsResponse> create(ListsRequest request) throws MailchimpException
    {
        String payload = GSON.toJson(request);
        return builder.post("/lists", payload, ListsResponse.class);
    }

    public MailchimpResponse<ListsReadResponse> read(ListsReadRequest request) throws MailchimpException
    {
        String url = "/lists";
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());
        url = MailchimpUtils.formatQueryString(url, "before_date_created", request.getBeforeDateCreated());
        url = MailchimpUtils.formatQueryString(url, "since_date_created", request.getSinceDateCreated());
        url = MailchimpUtils.formatQueryString(url, "before_campaign_last_sent", request.getBeforeCampaignLastSent());
        url = MailchimpUtils.formatQueryString(url, "since_campaign_last_sent", request.getSinceCampaignLastSent());
        url = MailchimpUtils.formatQueryString(url, "email", request.getEmail());

        return builder.get(url, ListsReadResponse.class);
    }

    public MailchimpResponse<ListsResponse> read(String listId, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsResponse.class);
    }

    public MailchimpResponse<ListsResponse> edit(String listId, ListsRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, ListsResponse.class);
    }

    public MailchimpResponse<Void> delete(String listId) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/lists/" + listId;
        return builder.delete(url, Void.class);
    }
}
