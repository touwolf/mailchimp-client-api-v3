package com.touwolf.mailchimp;

import com.touwolf.mailchimp.model.apiroot.ApiRoot;
import com.touwolf.mailchimp.model.campaign.Campaign;
import com.touwolf.mailchimp.model.campaign.CampaignContent;
import com.touwolf.mailchimp.model.campaign.CampaignFolder;

public interface MailchimpClient
{
    /**
     * The API root resource links to all other resources available in the API.
     * Calling the root directory also returns details about the MailChimp user account.
     *
     */
    ApiRoot apiRoot();

    /**
     * Organize your campaigns using folders.
     *
     * @return
     */
    CampaignFolder campaignFolder();

    /**
     * Campaigns are how you send emails to your MailChimp list. Use the Campaigns API calls to manage campaigns in your MailChimp account.
     *
     */
    Campaign campaign();

    /**
     * Manage the HTML, plain-text, and template content for your MailChimp campaigns.
     *
     */
    CampaignContent campaignContent();
}
