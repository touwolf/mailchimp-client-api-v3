package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class CampaignSegmentOpts
{
    @SerializedName("saved_segment_id")
    private Integer savedSegmentId;

    private String match;

    private CampaignConditions[] conditions;

    /**
     * The id for an existing saved segment.
     *
     */
    public Integer getSavedSegmentId() {
        return savedSegmentId;
    }

    public void setSavedSegmentId(Integer savedSegmentId) {
        this.savedSegmentId = savedSegmentId;
    }

    /**
     * Segment match type.
     *
     */
    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public CampaignConditions[] getConditions() {
        return conditions;
    }

    public void setConditions(CampaignConditions[] conditions) {
        this.conditions = conditions;
    }
}
