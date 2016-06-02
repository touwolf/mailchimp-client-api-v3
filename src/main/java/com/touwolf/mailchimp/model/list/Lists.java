package com.touwolf.mailchimp.model.list;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.list.data.ListsRequest;
import com.touwolf.mailchimp.model.list.data.ListsResponse;
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
}
