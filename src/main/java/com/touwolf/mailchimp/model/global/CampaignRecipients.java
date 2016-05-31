package com.touwolf.mailchimp.model.global;

import com.google.gson.annotations.SerializedName;

public class CampaignRecipients
{
    @SerializedName("list_id")
    private String listId;

    @SerializedName("list_name")
    private String listName;

    @SerializedName("segment_text")
    private String segmentText;

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

    /**
     * The name of the list.
     *
     * @return
     */
    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     * A description of the segment used for the campaign. Formatted as a string marked up with HTML.
     *
     * @return
     */
    public String getSegmentText() {
        return segmentText;
    }

    public void setSegmentText(String segmentText) {
        this.segmentText = segmentText;
    }
}
