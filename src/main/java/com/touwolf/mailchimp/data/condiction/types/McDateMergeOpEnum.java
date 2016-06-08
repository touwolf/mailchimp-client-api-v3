package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McDateMergeOpEnum
{
    @SerializedName("is")
    IS,
    @SerializedName("not")
    NOT,
    @SerializedName("less")
    LESS,
    @SerializedName("blank")
    BLANK,
    @SerializedName("blank_not")
    BLANK_NOT
}
