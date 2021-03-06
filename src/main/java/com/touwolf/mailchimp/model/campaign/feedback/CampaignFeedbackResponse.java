package com.touwolf.mailchimp.model.campaign.feedback;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class CampaignFeedbackResponse {
    @SerializedName("feedback_id")
    private Integer feedbackId;

    @SerializedName("parent_id")
    private Integer parentId;

    @SerializedName("block_id")
    private Integer blockId;

    private String message;

    @SerializedName("is_complete")
    private Boolean isComplete;

    @SerializedName("created_by")
    private String createdBy;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    private CampaignFeedbackSourceEnum source;

    @SerializedName("campaign_id")
    private String campaignId;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The individual id for the feedback item.
     */
    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * If a reply, the id of the parent feedback item.
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

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

    /**
     * The login name of the user who created the feedback.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * The date and time the feedback item was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The date and time the feedback was last updated.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The source of the feedback.
     * Possible Values:
     * api
     * email
     * sms
     * web
     * ios
     * android
     */
    public CampaignFeedbackSourceEnum getSource() {
        return source;
    }

    public void setSource(CampaignFeedbackSourceEnum source) {
        this.source = source;
    }

    /**
     * The unique id for the campaign.
     */
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * A list of link types and descriptions for the API schema documents.
     */
    public List<MailchimpLinks> getLinks() {
        return links;
    }

    public void setLinks(List<MailchimpLinks> links) {
        this.links = links;
    }
}
