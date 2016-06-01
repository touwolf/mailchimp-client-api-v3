package com.touwolf.mailchimp.model.campaign.data.folder;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.campaign.data.CampaignLinks;

import java.util.List;

public class CampaignFolderReadResponse
{
    private List<CampaignFolder> folders;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<CampaignLinks> links;

    /**
     * An array of objects representing campaign folders.
     *
     * @return
     */
    public List<CampaignFolder> getFolders() {
        return folders;
    }

    public void setFolders(List<CampaignFolder> folders) {
        this.folders = folders;
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