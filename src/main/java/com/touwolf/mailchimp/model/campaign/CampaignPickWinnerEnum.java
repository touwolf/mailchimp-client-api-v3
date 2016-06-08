package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignPickWinnerEnum {
    @SerializedName("opens")
    OPENS,
    @SerializedName("clicks")
    CLICKS,
    @SerializedName("manual")
    MANUAL
}
