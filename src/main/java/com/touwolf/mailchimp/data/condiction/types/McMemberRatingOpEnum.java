package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McMemberRatingOpEnum
{
    @SerializedName("is")
    IS,
    @SerializedName("not")
    NOT,
    @SerializedName("greater")
    GREATER,
    @SerializedName("less")
    LESS
}
