package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public enum CampaignSplitTestEnum
{
    @SerializedName("subject")
    SUBJECT,
    @SerializedName("from_name")
    FROM_NAME,
    @SerializedName("schedule")
    SCHEDULE
}
