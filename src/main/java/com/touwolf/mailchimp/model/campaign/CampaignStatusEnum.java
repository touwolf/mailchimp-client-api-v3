package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignStatusEnum {
    @SerializedName("save")
    SAVE,
    @SerializedName("paused")
    PAUSED,
    @SerializedName("schedule")
    SCHEDULE,
    @SerializedName("sending")
    SENDING,
    @SerializedName("sent")
    SENT
}
