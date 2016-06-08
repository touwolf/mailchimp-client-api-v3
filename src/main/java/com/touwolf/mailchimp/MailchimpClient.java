package com.touwolf.mailchimp;

import com.touwolf.mailchimp.api.apiroot.ApiRoot;
import com.touwolf.mailchimp.api.batch.Batch;
import com.touwolf.mailchimp.api.campaign.*;
import com.touwolf.mailchimp.api.lists.*;

public interface MailchimpClient {
    /**
     * The API root resource links to all other resources available in the API.
     * Calling the root directory also returns details about the MailChimp user account.
     */
    ApiRoot apiRoot();

    /**
     * Use batch operations to complete multiple operations with a single call.
     */
    Batch batch();

    /**
     * Organize your campaigns using folders.
     */
    CampaignFolder campaignFolder();

    /**
     * Campaigns are how you send emails to your MailChimp list. Use the Campaigns API calls to manage campaigns in your MailChimp account.
     */
    Campaign campaign();

    /**
     * Manage the HTML, plain-text, and template content for your MailChimp campaigns.
     */
    CampaignContent campaignContent();

    /**
     * Post comments, reply to team feedback, and send test emails while you’re working together on a MailChimp campaign.
     */
    CampaignFeedback campaignFeedback();

    /**
     * Review the send checklist for your campaign, and resolve any issues before sending.
     */
    CampaignSendChecklist campaignSendChecklist();

    /**
     * A MailChimp list is a powerful and flexible tool that helps you manage your contacts. Learn how to get started with lists in MailChimp.
     */
    Lists lists();

    /**
     * Manage abuse complaints for a specific list. An abuse complaint occurs when your recipient reports an email as spam in their mail program.
     */
    ListsAbuseReports listsAbuseReports();

    /**
     * Get recent daily, aggregated activity stats for your list. For example, view unsubscribes, signups, total emails sent, opens, clicks, and more, for up to 180 days.
     */
    ListsActivity listsActivity();

    /**
     * Get information about the most popular email clients for subscribers in a specific MailChimp list.
     */
    ListsClients listsClients();

    /**
     * View a summary of the month-by-month growth activity for a specific list.
     */
    ListsGrowthHistory listsGrowthHistory();

    /**
     * Manage interest categories for a specific list. Interest categories organize interests, which are used to group subscribers based on their preferences.
     * These correspond to ‘group titles’ in the MailChimp application. Learn more about groups in MailChimp.
     */
    ListsInterestCategories listsInterestCategories();

    /**
     * Manage members of a specific MailChimp list, including currently subscribed, unsubscribed, and bounced members.
     */
    ListsMembers listsMembers();

    /**
     * Manage merge fields (formerly merge vars) for a specific list.
     */
    ListsMergeFields listsMergeFields();

    /**
     * Manage segments for a specific MailChimp list.
     * A segment is a section of your list that includes only those subscribers who share specific common field information.
     * Learn more about segments in MailChimp.
     */
    ListsSegments listsSegments();

    /**
     * Manage webhooks for a specific MailChimp list.
     */
    ListsWebhooks listsWebhooks();
}
