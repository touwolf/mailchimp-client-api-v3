package com.touwolf.mailchimp.model.global;

import com.google.gson.annotations.SerializedName;

public class CampaignRecipients
{
    @SerializedName("list_id")
    private String listId;

    @SerializedName("segment_opts")
    private CampaignSegmentOpts segmentOpts;

    /**
     * The unique list id.
     *
     * @return
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * An object representing all segmentation options.
     *
     * @return
     */
    public CampaignSegmentOpts getSegmentOpts() {
        return segmentOpts;
    }

    public void setSegmentOpts(CampaignSegmentOpts segmentOpts) {
        this.segmentOpts = segmentOpts;
    }
}
