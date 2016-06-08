package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignFrequencyEnum {
    @SerializedName("daily")
    DAILY,
    @SerializedName("weekly")
    WEEKLY,
    @SerializedName("monthly")
    MONTHLY
}
