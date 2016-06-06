package com.touwolf.mailchimp.model.list;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.list.data.ListsRequest;
import com.touwolf.mailchimp.model.list.data.ListsResponse;
import com.touwolf.mailchimp.model.list.data.members.ListsMembersReadRequest;
import com.touwolf.mailchimp.model.list.data.members.ListsMembersReadResponse;
import com.touwolf.mailchimp.model.list.data.members.ListsMembersRequest;
import com.touwolf.mailchimp.model.list.data.members.ListsMembersResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Manage members of a specific MailChimp list, including currently subscribed, unsubscribed, and bounced members.
 */
@Component
public class ListsMembers
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsMembers builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<ListsMembersResponse> create(String listId, ListsMembersRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/members";
        String payload = GSON.toJson(request);
        return builder.post(url, payload, ListsMembersResponse.class);
    }

    public MailchimpResponse<ListsMembersReadResponse> read(String listId, ListsMembersReadRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/members";

        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());
        url = MailchimpUtils.formatQueryString(url, "email_type", request.getEmailType());
        url = MailchimpUtils.formatQueryString(url, "status", request.getStatus());
        url = MailchimpUtils.formatQueryString(url, "since_timestamp_opt", request.getSinceTimestampOpt());
        url = MailchimpUtils.formatQueryString(url, "before_timestamp_opt", request.getBeforeTimestampOpt());
        url = MailchimpUtils.formatQueryString(url, "since_last_changed", request.getSinceLastChanged());
        url = MailchimpUtils.formatQueryString(url, "before_last_changed", request.getBeforeLastChanged());
        url = MailchimpUtils.formatQueryString(url, "unique_email_id", request.getUniqueEmailId());
        url = MailchimpUtils.formatQueryString(url, "vip_only", request.getVipOnly());

        return builder.get(url, ListsMembersReadResponse.class);
    }

    public MailchimpResponse<ListsMembersResponse> read(String listId, String subscriberHash, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsMembersResponse.class);
    }

    public MailchimpResponse<ListsMembersResponse> edit(String listId, String subscriberHash, ListsMembersRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, ListsMembersResponse.class);
    }

    public MailchimpResponse<ListsMembersResponse> editOrAdd(String listId, String subscriberHash, ListsMembersRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash;
        String payload = GSON.toJson(request);
        return builder.put(url, payload, ListsMembersResponse.class);
    }

    public MailchimpResponse<Void> delete(String listId, String subscriberHash) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash;
        return builder.delete(url, Void.class);
    }
}
