package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McDateValueEnum
{
    @SerializedName("date")
    DATE,
    @SerializedName("campaign")
    CAMPAIGN,
    @SerializedName("last")
    LAST
}
