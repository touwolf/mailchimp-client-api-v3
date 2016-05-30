package com.touwolf.mailchimp.impl;

import com.touwolf.mailchimp.MailchimpClient;

public class MailchimpClientImpl implements MailchimpClient
{
    private String apiKey;

    public MailchimpClientImpl(String apiKey)
    {
        this.apiKey = apiKey;
    }
}
