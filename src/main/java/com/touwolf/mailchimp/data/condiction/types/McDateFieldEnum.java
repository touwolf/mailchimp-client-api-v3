package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McDateFieldEnum
{
    @SerializedName("timestamp_opt")
    TIMESTAMP_OPT,
    @SerializedName("info_changed")
    INFO_CHANGED,
    @SerializedName("ecomm_date")
    ECOMM_DATE
}
