package com.touwolf.mailchimp.model.batch;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
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
}
