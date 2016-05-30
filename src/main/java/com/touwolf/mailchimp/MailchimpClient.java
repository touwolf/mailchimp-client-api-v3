package com.touwolf.mailchimp;

import com.touwolf.mailchimp.model.apiroot.ApiRoot;

public interface MailchimpClient
{
    /**
     * The API root resource links to all other resources available in the API.
     * Calling the root directory also returns details about the MailChimp user account.
     *
     * @return
     */
    ApiRoot apiRoot();
}
