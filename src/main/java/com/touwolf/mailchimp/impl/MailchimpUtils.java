package com.touwolf.mailchimp.impl;

public class MailchimpUtils
{
    public static String getApiUrl(String apiKey)
    {
        String[] split = apiKey.split("-");

        return "https://" + split[1] + ".api.mailchimp.com/3.0/";
    }
}
