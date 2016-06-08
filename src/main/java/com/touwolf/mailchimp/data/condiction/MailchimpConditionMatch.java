package com.touwolf.mailchimp.data.condiction;

import com.google.gson.annotations.SerializedName;

public enum MailchimpConditionMatch {
    @SerializedName("any")
    ANY,
    @SerializedName("all")
    ALL
}
