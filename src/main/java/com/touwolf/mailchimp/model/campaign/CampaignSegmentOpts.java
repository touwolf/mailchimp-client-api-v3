package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.condiction.MailchimpConditionMatch;
import com.touwolf.mailchimp.data.condiction.MailchimpConditions;

public class CampaignSegmentOpts {
    @SerializedName("saved_segment_id")
    private Integer savedSegmentId;

    private MailchimpConditionMatch match;

    private MailchimpConditions[] conditions;

    /**
     * The id for an existing saved segment.
     */
    public Integer getSavedSegmentId() {
        return savedSegmentId;
    }

    public void setSavedSegmentId(Integer savedSegmentId) {
        this.savedSegmentId = savedSegmentId;
    }

    /**
     * Segment match type.
     * Possible Values:
     * <p>
     * any
     * all
     */
    public MailchimpConditionMatch getMatch() {
        return match;
    }

    public void setMatch(MailchimpConditionMatch match) {
        this.match = match;
    }

    public MailchimpConditions[] getConditions() {
        return conditions;
    }

    public void setConditions(MailchimpConditions[] conditions) {
        this.conditions = conditions;
    }
}
