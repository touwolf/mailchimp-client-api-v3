package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignWeeklySendDayEnum {
    @SerializedName("sunday")
    SUNDAY,
    @SerializedName("monday")
    MONDAY,
    @SerializedName("tuesday")
    TUESDAY,
    @SerializedName("wednesday")
    WEDNESDAY,
    @SerializedName("thursday")
    THURSDAY,
    @SerializedName("friday")
    FRIDAY,
    @SerializedName("saturday")
    SATURDAY
}
