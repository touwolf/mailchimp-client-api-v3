package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignTypeEnum {
    @SerializedName("regular")
    REGULAR,
    @SerializedName("plaintext")
    PLAIN_TEXT,
    @SerializedName("absplit")
    AB_SPLIT,
    @SerializedName("rss")
    RSS,
    @SerializedName("variate")
    VARIATE
}
