package com.touwolf.mailchimp.model.campaign.feedback;

import com.google.gson.annotations.SerializedName;

public class CampaignFeedbackRequest {
    @SerializedName("block_id")
    private Integer blockId;

    private String message;

    @SerializedName("is_complete")
    private Boolean isComplete;

    /**
     * The block id for the editable block that the feedback addresses.
     */
    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    /**
     * The content of the feedback.
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The status of feedback.
     */
    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }
}
