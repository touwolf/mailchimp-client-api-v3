package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McAddressMergeOpEnum
{
    @SerializedName("contains")
    CONTAINS,
    @SerializedName("notcontain")
    NOT_CONTAIN,
    @SerializedName("blank")
    BLANK,
    @SerializedName("blank_not")
    BLANK_NOT
}
