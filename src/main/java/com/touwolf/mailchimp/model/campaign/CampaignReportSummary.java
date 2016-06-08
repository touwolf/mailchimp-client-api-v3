package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

class CampaignReportSummary {
    private Integer opens;

    @SerializedName("unique_opens")
    private Integer uniqueOpens;

    @SerializedName("open_rate")
    private Integer openRate;

    @SerializedName("clicks")
    private Integer clicks;

    @SerializedName("subscriber_clicks")
    private Integer subscriberClicks;

    @SerializedName("click_rate")
    private Integer clickRate;

    private CampaignEcommerce ecommerce;

    /**
     * The total number of opens for a campaign.
     */
    public Integer getOpens() {
        return opens;
    }

    public void setOpens(Integer opens) {
        this.opens = opens;
    }

    /**
     * The number of unique opens.
     */
    public Integer getUniqueOpens() {
        return uniqueOpens;
    }

    public void setUniqueOpens(Integer uniqueOpens) {
        this.uniqueOpens = uniqueOpens;
    }

    /**
     * The number of unique opens divided by the total number of successful deliveries.
     */
    public Integer getOpenRate() {
        return openRate;
    }

    public void setOpenRate(Integer openRate) {
        this.openRate = openRate;
    }

    /**
     * The total number of clicks for an campaign.
     */
    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    /**
     * The number of unique clicks.
     */
    public Integer getSubscriberClicks() {
        return subscriberClicks;
    }

    public void setSubscriberClicks(Integer subscriberClicks) {
        this.subscriberClicks = subscriberClicks;
    }

    /**
     * The number of unique clicks divided by the total number of successful deliveries.
     */
    public Integer getClickRate() {
        return clickRate;
    }

    public void setClickRate(Integer clickRate) {
        this.clickRate = clickRate;
    }

    /**
     * E-Commerce stats for a campaign.
     */
    public CampaignEcommerce getEcommerce() {
        return ecommerce;
    }

    public void setEcommerce(CampaignEcommerce ecommerce) {
        this.ecommerce = ecommerce;
    }
}
