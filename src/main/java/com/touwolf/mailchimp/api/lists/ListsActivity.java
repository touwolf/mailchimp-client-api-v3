package com.touwolf.mailchimp.api.lists;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.model.list.activity.ListsActivityReadResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Get recent daily, aggregated activity stats for your list. For example, view unsubscribes, signups,
 * total emails sent, opens, clicks, and more, for up to 180 days.
 */

@Component
public class ListsActivity
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsActivity builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    /**
     * Get up to the previous 180 days of daily detailed aggregated activity stats for a list, not including Automation activity.
     *
     * @param listId The unique id for the list.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsActivityReadResponse> read(String listId, String fields, String excludeFields) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/activity";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsActivityReadResponse.class);
    }
}
