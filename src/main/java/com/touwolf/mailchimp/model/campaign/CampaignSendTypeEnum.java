package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignSendTypeEnum {
    @SerializedName("html")
    HTML,
    @SerializedName("plain_text")
    PLAIN_TEXT
}
