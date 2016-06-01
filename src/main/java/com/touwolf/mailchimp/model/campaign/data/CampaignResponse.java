package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CampaignResponse
{
    private String id;

    private String type;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("archive_url")
    private String archiveUrl;

    @SerializedName("long_archive_url")
    private String longArchiveUrl;

    private String status;

    @SerializedName("emails_sent")
    private Integer emailsSent;

    @SerializedName("send_time")
    private String sendTime;

    @SerializedName("content_type")
    private String contentType;

    private CampaignRecipients recipients;

    private CampaignSettings settings;

    @SerializedName("variate_settings")
    private CampaignVariateSettings variateSettings;

    private CampaignTracking tracking;

    @SerializedName("rss_opts")
    private CampaignRssOpts rssOpts;

    @SerializedName("ab_split_opts")
    private CampaignAbSplitOpts abSplitOpts;

    @SerializedName("social_card")
    private  CampaignSocialCard socialCard;

    @SerializedName("report_summary")
    private CampaignReportSummary reportSummary;

    @SerializedName("delivery_status")
    private CampaignDeliveryStatus deliveryStatus;

    @SerializedName("_links")
    private List<CampaignLinks> links;

    /**
     * A string that uniquely identifies this campaign.
     *
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * There are four types of campaigns you can create in MailChimp. A/B Split campaigns have been deprecated and variate campaigns should be used instead.
     * Possible Values:
     * regular
     * plaintext
     * absplit
     * rss
     * variate

     * @return
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The date and time the campaign was created.
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * The link to the campaign’s archive version.
     *
     * @return
     */
    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    /**
     * The original link to the campaign’s archive version.
     *
     * @return
     */
    public String getLongArchiveUrl() {
        return longArchiveUrl;
    }

    public void setLongArchiveUrl(String longArchiveUrl) {
        this.longArchiveUrl = longArchiveUrl;
    }

    /**
     * The current status of the campaign.
     * Possible Values:

     * save
     * paused
     * schedule
     * sending
     * sent
     * @return
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The total number of emails sent for this campaign.
     *
     * @return
     */
    public Integer getEmailsSent() {
        return emailsSent;
    }

    public void setEmailsSent(Integer emailsSent) {
        this.emailsSent = emailsSent;
    }

    /**
     * The date and time a campaign was sent.
     *
     * @return
     */
    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * How the campaign’s content is put together (‘template’, ‘drag_and_drop’, ‘html’, ‘url’).
     *
     * @return
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * List settings for the campaign.
     *
     * @return
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
     * @return
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
     * @return
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
     * @return
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
     * @return
     */
    public CampaignRssOpts getRssOpts() {
        return rssOpts;
    }

    public void setRssOpts(CampaignRssOpts rssOpts) {
        this.rssOpts = rssOpts;
    }

    /**
     * A/B Testing options for a campaign.
     *
     * @return
     */
    public CampaignAbSplitOpts getAbSplitOpts() {
        return abSplitOpts;
    }

    public void setAbSplitOpts(CampaignAbSplitOpts abSplitOpts) {
        this.abSplitOpts = abSplitOpts;
    }

    /**
     * The preview for the campaign, rendered by social networks like Facebook and Twitter. Learn more.
     *
     * @return
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
     * @return
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
     * @return
     */
    public CampaignDeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(CampaignDeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * A list of link types and descriptions for the API schema documents.
     *
     * @return
     */
    public List<CampaignLinks> getLinks() {
        return links;
    }

    public void setLinks(List<CampaignLinks> links) {
        this.links = links;
    }
}
