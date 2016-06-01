package com.touwolf.mailchimp.model.campaign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import org.bridje.ioc.Component;

/**
 * Post comments, reply to team feedback, and send test emails while you’re working together on a MailChimp campaign.
 */
@Component
public class CampaignFeedback
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public CampaignFeedback builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }
}
