package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

class CampaignDeliveryStatus
{
    private Boolean enabled;

    @SerializedName("can_cancel")
    private Boolean canCancel;

    private String status;

    @SerializedName("emails_sent")
    private Integer emailsSent;

    @SerializedName("emails_canceled")
    private Integer emailsCanceled;

    /**
     * Whether Campaign Delivery Status is enabled for this account and campaign.
     *
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether a campaign send can be canceled.
     *
     */
    public Boolean getCanCancel() {
        return canCancel;
    }

    public void setCanCancel(Boolean canCancel) {
        this.canCancel = canCancel;
    }

    /**
     * The current state of a campaign delivery.
     *
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The total number of emails confirmed sent for this campaign so far.
     *
     */
    public Integer getEmailsSent() {
        return emailsSent;
    }

    public void setEmailsSent(Integer emailsSent) {
        this.emailsSent = emailsSent;
    }

    /**
     * The total number of emails canceled for this campaign.
     *
     */
    public Integer getEmailsCanceled() {
        return emailsCanceled;
    }

    public void setEmailsCanceled(Integer emailsCanceled) {
        this.emailsCanceled = emailsCanceled;
    }
}
