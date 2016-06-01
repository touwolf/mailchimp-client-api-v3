package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CampaignReadResponse
{
    private List<CampaignResponse> campaign;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<CampaignLinks> links;

    /**
     * An array of campaigns.
     *
     * @return
     */
    public List<CampaignResponse> getCampaign() {
        return campaign;
    }

    public void setCampaign(List<CampaignResponse> campaign) {
        this.campaign = campaign;
    }

    /**
     * The total number of items matching the query regardless of pagination.
     *
     * @return
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
     * @return
     */
    public List<CampaignLinks> getLinks() {
        return links;
    }

    public void setLinks(List<CampaignLinks> links) {
        this.links = links;
    }
}