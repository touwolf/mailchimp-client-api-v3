package com.touwolf.mailchimp.model.campaign.data.feedback;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.campaign.data.CampaignLinks;

import java.util.List;

public class CampaignFeedbackReadResponse
{
    private List<CampaignFeedbackResponse> feedback;

    @SerializedName("campaign_id")
    private String campaignId;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<CampaignLinks> links;

    /**
     * A collection of feedback items for a campaign.
     *
     */
    public List<CampaignFeedbackResponse> getFeedback() {
        return feedback;
    }

    public void setFeedback(List<CampaignFeedbackResponse> feedback) {
        this.feedback = feedback;
    }

    /**
     * The unique id for the campaign.
     *
     */
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * The total number of items matching the query regardless of pagination.
     *
     */
    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    /**
     * A list of link types and descriptions for the API schema documents.
     *
     */
    public List<CampaignLinks> getLinks() {
        return links;
    }

    public void setLinks(List<CampaignLinks> links) {
        this.links = links;
    }
}
