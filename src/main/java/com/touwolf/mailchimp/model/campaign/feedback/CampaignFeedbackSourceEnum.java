package com.touwolf.mailchimp.model.campaign.feedback;

import com.google.gson.annotations.SerializedName;

public enum CampaignFeedbackSourceEnum {
    @SerializedName("api")
    API,
    @SerializedName("email")
    EMAIL,
    @SerializedName("sms")
    SMS,
    @SerializedName("web")
    WEB,
    @SerializedName("ios")
    IOS,
    @SerializedName("android")
    ANDROID
}
