package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McTextMergeOpEnum
{
    @SerializedName("is")
    IS,
    @SerializedName("not")
    NOT,
    @SerializedName("contains")
    CONTAINS,
    @SerializedName("notcontain")
    NOT_CONTAIN,
    @SerializedName("starts")
    STARTS,
    @SerializedName("ends")
    ENDS,
    @SerializedName("greater")
    GREATER,
    @SerializedName("less")
    LESS,
    @SerializedName("blank")
    BLANK,
    @SerializedName("blank_not")
    BLANK_NOT
}
