package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McAimOpEnum
{
    @SerializedName("open")
    OPEN,
    @SerializedName("click")
    CLICK,
    @SerializedName("sent")
    SENT,
    @SerializedName("noopen")
    NOOPEN,
    @SerializedName("noclick")
    NOCLICK,
    @SerializedName("nosent")
    NOSENT
}
