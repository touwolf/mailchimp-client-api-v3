package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McGoalActivityOpEnum {
    @SerializedName("is")
    IS,
    @SerializedName("goal_not")
    GOAL_NOT,
    @SerializedName("contains")
    CONTAINS,
    @SerializedName("goal_notcontain")
    GOAL_NOT_CONTAIN,
    @SerializedName("starts")
    STARTS,
    @SerializedName("ends")
    ENDS
}
