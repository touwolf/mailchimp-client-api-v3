package com.touwolf.mailchimp.model.campaign.folder;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class CampaignFolderResponse {
    private String name;

    private String id;

    private Integer count;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The name of the folder.
     *
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A string that uniquely identifies this campaign folder.
     *
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The number of campaigns in the folder.
     *
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
