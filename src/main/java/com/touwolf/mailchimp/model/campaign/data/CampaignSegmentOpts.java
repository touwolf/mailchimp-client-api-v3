package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class CampaignSegmentOpts
{
    @SerializedName("seved_segment+_id")
    private Integer savedSegmentId;

    private String match;

    private List<CampaignConditions> conditions;

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

    public List<CampaignConditions> getConditions() {
        return conditions;
    }

    public void setConditions(List<CampaignConditions> conditions) {
        this.conditions = conditions;
    }
}
