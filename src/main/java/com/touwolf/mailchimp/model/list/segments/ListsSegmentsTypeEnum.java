package com.touwolf.mailchimp.model.list.segments;

import com.google.gson.annotations.SerializedName;

public enum ListsSegmentsTypeEnum {
    @SerializedName("saved")
    SAVED,
    @SerializedName("static")
    STATIC,
    @SerializedName("fuzzy")
    FUZZY
}
