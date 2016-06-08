package com.touwolf.mailchimp.model.list.members;

import com.google.gson.annotations.SerializedName;

public class ListsMembersActivityResponse {
    private String action;

    private String timestamp;

    private String url;

    private String type;

    @SerializedName("campaign_id")
    private String campaignId;

    private String title;

    @SerializedName("parent_campaign")
    private String parentCampaign;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentCampaign() {
        return parentCampaign;
    }

    public void setParentCampaign(String parentCampaign) {
        this.parentCampaign = parentCampaign;
    }
}
