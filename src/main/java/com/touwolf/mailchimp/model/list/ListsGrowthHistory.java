package com.touwolf.mailchimp.model.list;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import org.bridje.ioc.Component;

/**
 * View a summary of the month-by-month growth activity for a specific list.
 */
@Component
public class ListsGrowthHistory
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsGrowthHistory builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }
}
