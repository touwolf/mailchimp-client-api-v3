package com.touwolf.mailchimp.model.camapign.data;

import com.google.gson.annotations.SerializedName;

public class CampaignTracking
{

    private Boolean opens;

    @SerializedName("html_clicks")
    private Boolean htmlClicks;

    @SerializedName("text_clicks")
    private Boolean textClicks;

    @SerializedName("goal_tracking")
    private Boolean goalTracking;

    private Boolean ecomm360;

    @SerializedName("google_analytics")
    private String googleAnalytics;

    private String clicktale;

    private CampaignSalesforce salesforce;

    private CampaignHighrise highrise;

    private CampaignCapsule capsule;

    /**
     * Whether to track opens. Defaults to true. Cannot be set to false for variate campaigns.
     *
     * @return
     */
    public Boolean getOpens() {
        return opens;
    }

    public void setOpens(Boolean opens) {
        this.opens = opens;
    }

    /**
     * Whether to track clicks in the HTML version of the campaign. Defaults to true. Cannot be set to false for variate campaigns.
     *
     * @return
     */
    public Boolean getHtmlClicks() {
        return htmlClicks;
    }

    public void setHtmlClicks(Boolean htmlClicks) {
        this.htmlClicks = htmlClicks;
    }

    /**
     * Whether to track clicks in the plain-text version of the campaign. Defaults to true. Cannot be set to false for variate campaigns.
     *
     * @return
     */
    public Boolean getTextClicks() {
        return textClicks;
    }

    public void setTextClicks(Boolean textClicks) {
        this.textClicks = textClicks;
    }

    /**
     * Whether to enable Goal tracking.
     *
     * @return
     */
    public Boolean getGoalTracking() {
        return goalTracking;
    }

    public void setGoalTracking(Boolean goalTracking) {
        this.goalTracking = goalTracking;
    }

    /**
     * Whether to enable eCommerce360 tracking.
     *
     * @return
     */
    public Boolean getEcomm360() {
        return ecomm360;
    }

    public void setEcomm360(Boolean ecomm360) {
        this.ecomm360 = ecomm360;
    }

    /**
     * The custom slug for Google Analytics tracking (max of 50 bytes).
     *
     * @return
     */
    public String getGoogleAnalytics() {
        return googleAnalytics;
    }

    public void setGoogleAnalytics(String googleAnalytics) {
        this.googleAnalytics = googleAnalytics;
    }

    /**
     * The custom slug for ClickTale tracking (max of 50 bytes).
     *
     * @return
     */
    public String getClicktale() {
        return clicktale;
    }

    public void setClicktale(String clicktale) {
        this.clicktale = clicktale;
    }

    /**
     * Salesforce tracking options for a campaign. Must be using MailChimp’s built-in Salesforce integration.
     *
     * @return
     */
    public CampaignSalesforce getSalesforce() {
        return salesforce;
    }

    public void setSalesforce(CampaignSalesforce salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * Highrise tracking options for a campaign. Must be using MailChimp’s built-in Highrise integration.
     *
     * @return
     */
    public CampaignHighrise getHighrise() {
        return highrise;
    }


    public void setHighrise(CampaignHighrise highrise) {
        this.highrise = highrise;
    }

    /**
     * Capsule tracking options for a campaign. Must be using MailChimp’s built-in Capsule integration.
     *
     * @return
     */
    public CampaignCapsule getCapsule() {
        return capsule;
    }

    public void setCapsule(CampaignCapsule capsule) {
        this.capsule = capsule;
    }
}
