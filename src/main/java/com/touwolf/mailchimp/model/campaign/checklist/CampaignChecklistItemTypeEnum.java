package com.touwolf.mailchimp.model.campaign.checklist;

import com.google.gson.annotations.SerializedName;

public enum CampaignChecklistItemTypeEnum {
    @SerializedName("success")
    SUCCESS,
    @SerializedName("warning")
    WARNING,
    @SerializedName("error")
    ERROR
}
