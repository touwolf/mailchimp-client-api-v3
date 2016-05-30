package com.touwolf.mailchimp.model.camapign;

import com.touwolf.mailchimp.impl.MailchimpBuilder;

public class Campaign
{
    private MailchimpBuilder builder;

    public Campaign builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }
}
