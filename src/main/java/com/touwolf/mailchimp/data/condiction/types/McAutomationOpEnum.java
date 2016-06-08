package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McAutomationOpEnum {
    @SerializedName("started")
    STARTED,
    @SerializedName("completed")
    COMPLETED,
    @SerializedName("not_started")
    NOT_STARTED,
    @SerializedName("not_completed")
    NOT_COMPLETED
}
