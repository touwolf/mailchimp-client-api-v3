package com.touwolf.mailchimp.model.campaign.data;

import com.touwolf.mailchimp.model.MailchimpConditions;
import com.google.gson.annotations.SerializedName;

public class CampaignSegmentOpts
{
    @SerializedName("saved_segment_id")
    private Integer savedSegmentId;

    private String match;

    private MailchimpConditions[] conditions;

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

    public MailchimpConditions[] getConditions() {
        return conditions;
    }

    public void setConditions(MailchimpConditions[] conditions) {
        this.conditions = conditions;
    }
}
