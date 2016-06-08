package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignWaitUnits {
    @SerializedName("hours")
    HOURS,
    @SerializedName("days")
    DAYS
}
