package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McGoalTimestampOpEnum
{
    @SerializedName("greater")
    GREATER,
    @SerializedName("less")
    LESS,
    @SerializedName("is")
    IS
}
