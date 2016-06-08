package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public class CampaignRequest {
    private CampaignTypeEnum type;

    private CampaignRecipients recipients;

    private CampaignSettings settings;

    @SerializedName("variate_settings")
    private CampaignVariateSettings variateSettings;

    private CampaignTracking tracking;

    @SerializedName("rss_opts")
    private CampaignRssOpts rssOpts;

    @SerializedName("social_card")
    private CampaignSocialCard socialCard;

    @SerializedName("report_summary")
    private CampaignReportSummary reportSummary;

    @SerializedName("delivery_status")
    private CampaignDeliveryStatus deliveryStatus;

    /**
     * There are four types of campaigns you can create in MailChimp. A/B Split campaigns have been deprecated and variate campaigns should be used instead.
     * Possible Values:
     * <p>
     * regular
     * plaintext
     * absplit
     * rss
     * variate
     *
     */
    public CampaignTypeEnum getType() {
        return type;
    }

    public void setType(CampaignTypeEnum type) {
        this.type = type;
    }

    /**
     * List settings for the campaign.
     *
     */
    public CampaignRecipients getRecipients() {
        return recipients;
    }

    public void setRecipients(CampaignRecipients recipients) {
        this.recipients = recipients;
    }

    /**
     * The settings for your campaign, including subject, from name, reply-to address, and more.
     *
     */
    public CampaignSettings getSettings() {
        return settings;
    }

    public void setSettings(CampaignSettings settings) {
        this.settings = settings;
    }

    /**
     * The settings specific to A/B test campaigns.
     *
     */
    public CampaignVariateSettings getVariateSettings() {
        return variateSettings;
    }

    public void setVariateSettings(CampaignVariateSettings variateSettings) {
        this.variateSettings = variateSettings;
    }

    /**
     * The tracking options for a campaign.
     *
     */
    public CampaignTracking getTracking() {
        return tracking;
    }

    public void setTracking(CampaignTracking tracking) {
        this.tracking = tracking;
    }

    /**
     * RSS options for a campaign.
     *
     */
    public CampaignRssOpts getRssOpts() {
        return rssOpts;
    }


    public void setRssOpts(CampaignRssOpts rssOpts) {
        this.rssOpts = rssOpts;
    }

    /**
     * The preview for the campaign, rendered by social networks like Facebook and Twitter. Learn more.
     *
     */
    public CampaignSocialCard getSocialCard() {
        return socialCard;
    }

    public void setSocialCard(CampaignSocialCard socialCard) {
        this.socialCard = socialCard;
    }

    /**
     * For sent campaigns, a summary of opens, clicks, and unsubscribes.
     *
     */
    public CampaignReportSummary getReportSummary() {
        return reportSummary;
    }

    public void setReportSummary(CampaignReportSummary reportSummary) {
        this.reportSummary = reportSummary;
    }

    /**
     * Updates on campaigns in the process of sending.
     *
     */
    public CampaignDeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(CampaignDeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
