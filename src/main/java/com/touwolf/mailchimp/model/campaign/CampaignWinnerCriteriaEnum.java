package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignWinnerCriteriaEnum
{
    @SerializedName("opens")
    OPENS,
    @SerializedName("clicks")
    CLICKS,
    @SerializedName("manual")
    MANUAL,
    @SerializedName("total_revenue")
    TOTAL_REVENUE
}
