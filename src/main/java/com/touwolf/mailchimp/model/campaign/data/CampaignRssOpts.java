package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

public class CampaignRssOpts
{
    private String feedUrl;

    private String frequency;

    private CampaignSchedule schedule;

    @SerializedName("last_sent")
    private String lastSent;

    @SerializedName("constrain_rss_img")
    private Boolean constrainRssImg;

    /**
     * The URL for the RSS feed.
     *
     * @return
     */
    public String getFeedUrl() {
        return feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    /**
     * The frequency of the RSS Campaign.
     * Possible Values:
     *
     * daily
     * weekly
     * monthly
     *
     * @return
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * The schedule for sending the RSS Campaign.
     *
     * @return
     */
    public CampaignSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(CampaignSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * The date the campaign was last sent.
     *
     * @return
     */
    public String getLastSent() {
        return lastSent;
    }

    public void setLastSent(String lastSent) {
        this.lastSent = lastSent;
    }

    /**
     * Whether to add CSS to images in the RSS feed to constrain their width in campaigns.
     *
     * @return
     */
    public Boolean getConstrainRssImg() {
        return constrainRssImg;
    }

    public void setConstrainRssImg(Boolean constrainRssImg) {
        this.constrainRssImg = constrainRssImg;
    }
}
