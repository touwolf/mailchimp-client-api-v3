package com.touwolf.mailchimp.model.batch;

import com.google.gson.annotations.SerializedName;

public enum BatchStatusResponse {
    @SerializedName("pending")
    PENDING,
    @SerializedName("started")
    STARTED,
    @SerializedName("finished")
    FINISHED
}
