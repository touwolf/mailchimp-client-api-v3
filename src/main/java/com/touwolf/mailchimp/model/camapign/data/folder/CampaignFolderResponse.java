package com.touwolf.mailchimp.model.camapign.data.folder;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.Links;

import java.util.List;

public class CampaignFolderResponse
{
    private String name;

    private String id;

    private Integer count;

    @SerializedName("_links")
    private List<Links> links;

    /**
     * The name of the folder.
     *
     * @return
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
     * @return
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
     * @return
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
     * @return
     */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }
}