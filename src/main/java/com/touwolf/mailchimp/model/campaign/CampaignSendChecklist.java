package com.touwolf.mailchimp.model.campaign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import org.bridje.ioc.Component;

/**
 * Review the send checklist for your campaign, and resolve any issues before sending.
 */
@Component
public class CampaignSendChecklist
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public CampaignSendChecklist builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }
}
