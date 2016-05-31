package com.touwolf.mailchimp.model.global;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CampaignSegmentOpts
{
    @SerializedName("seved_segment+_id")
    private Integer savedSegmentId;

    private String match;

    private List<CampaignConditions> conditions;

    /**
     * The id for an existing saved segment.
     *
     * @return
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
     * @return
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
