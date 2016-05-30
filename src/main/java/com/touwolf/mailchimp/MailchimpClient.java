package com.touwolf.mailchimp;

import com.touwolf.mailchimp.model.apiroot.ApiRootResponse;

public interface MailchimpClient
{
    ApiRootResponse getApiRoot();

    ApiRootResponse getApiRoot(String field, String exlucdeFields);
}
