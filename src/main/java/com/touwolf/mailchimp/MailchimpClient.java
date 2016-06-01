package com.touwolf.mailchimp;

import com.touwolf.mailchimp.model.apiroot.ApiRoot;
import com.touwolf.mailchimp.model.campaign.*;

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

    /**
     * Post comments, reply to team feedback, and send test emails while you’re working together on a MailChimp campaign.
     *
     */
    CampaignFeedback campaignFeedback();

    /**
     * Review the send checklist for your campaign, and resolve any issues before sending.
     *
     */
    CampaignSendChecklist campaignSendChecklist();
}
