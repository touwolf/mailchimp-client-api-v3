package com.touwolf.mailchimp.impl;

import com.touwolf.mailchimp.MailchimpClient;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.apiroot.ApiRootResponse;
import org.apache.commons.lang.StringUtils;

public class MailchimpClientImpl implements MailchimpClient
{
    private MailchimpBuilder builder;

    public MailchimpClientImpl(String username, String apiKey)
    {
        builder = new MailchimpBuilder(MailchimpUtils.getApiUrl(apiKey), username, apiKey, 30000);
    }

    @Override
    public ApiRootResponse getApiRoot()
    {
        return getApiRoot("", "");
    }

    @Override
    public ApiRootResponse getApiRoot(String fields, String excludeFields)
    {
        try
        {
            String queryString = "";
            if(StringUtils.isNotBlank(fields))
            {
                queryString += "?fields=" + fields;
            }

            if(StringUtils.isNotBlank(excludeFields))
            {
                queryString += StringUtils.isBlank(queryString) ?
                        "?exclude_fields=" + excludeFields : "&exclude_fields=" + excludeFields;
            }

            MailchimpResponse<ApiRootResponse> response = builder.get(queryString, ApiRootResponse.class);
            return null == response ? null : response.getData();
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }
}
