package com.touwolf.mailchimp.impl;

import org.apache.commons.lang.StringUtils;

public class MailchimpUtils
{
    public static String getApiUrl(String apiKey)
    {
        String[] split = apiKey.split("-");

        return "https://" + split[1] + ".api.mailchimp.com/3.0/";
    }

    public static String formatQueryString(String url, String field, String value)
    {
        if(StringUtils.isBlank(value))
        {
            return url;
        }

        return url.contains("?") ? "&" + field + "=" + value: "?" + field + "=" + value;
    }

    public static String formatQueryString(String url, String field, Integer value)
    {
        if(null == value)
        {
            return url;
        }

        return url.contains("?") ? "&" + field + "=" + value: "?" + field + "=" + value;
    }

    public static String formatQueryString(String url, String field, Boolean value)
    {
        if(null == value)
        {
            return url;
        }

        return url.contains("?") ? "&" + field + "=" + value: "?" + field + "=" + value;
    }

    public static String formatQueryString(String url, String field, Enum value)
    {
        if(null == value)
        {
            return url;
        }

        return url.contains("?") ? "&" + field + "=" + value: "?" + field + "=" + value;
    }
}
