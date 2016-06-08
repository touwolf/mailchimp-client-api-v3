package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class CampaignReadResponse {
    private List<CampaignResponse> campaigns;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * An array of campaigns.
     *
     */
    public List<CampaignResponse> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<CampaignResponse> campaigns) {
        this.campaigns = campaigns;
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
    public List<MailchimpLinks> getLinks() {
        return links;
    }

    public void setLinks(List<MailchimpLinks> links) {
        this.links = links;
    }
}
