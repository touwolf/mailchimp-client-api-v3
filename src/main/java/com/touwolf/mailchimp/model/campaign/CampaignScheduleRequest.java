package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public class CampaignScheduleRequest {
    @SerializedName("schedule_time")
    private String scheduleTime;

    private Boolean timewarp;

    @SerializedName("batch_delivery")
    private CampaignBatchDelivery batchDelivery;

    /**
     * The date and time in UTC to schedule the campaign for delivery. Campaigns may only be scheduled to send on the quarter-hour (:00, :15, :30, :45).
     *
     */
    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    /**
     * Choose whether the campaign should use Timewarp when sending. Campaigns scheduled with Timewarp are localized based on the recipients’ time zones.
     * For example, a Timewarp campaign with a schedule_time of 13:00 will be sent to each recipient at 1:00pm in their local time.
     * Cannot be set to true for campaigns using Batch Delivery.
     *
     */
    public Boolean getTimewarp() {
        return timewarp;
    }

    public void setTimewarp(Boolean timewarp) {
        this.timewarp = timewarp;
    }

    /**
     * Choose whether the campaign should use Batch Delivery. Cannot be set to true for campaigns using Timewarp.
     *
     */
    public CampaignBatchDelivery getBatchDelivery() {
        return batchDelivery;
    }

    public void setBatchDelivery(CampaignBatchDelivery batchDelivery) {
        this.batchDelivery = batchDelivery;
    }
}
