package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McEcommCategoryOpEnum
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
    ENDS
}
