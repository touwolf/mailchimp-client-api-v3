package com.touwolf.mailchimp.model.list.members;

import com.google.gson.annotations.SerializedName;

public enum ListsMembersStatusEnum
{
    @SerializedName("subscribed")
    SUBSCRIBED,
    @SerializedName("unsubscribed")
    UNSUBSCRIBED,
    @SerializedName("cleaned")
    CLEANED,
    @SerializedName("pending")
    PENDING
}
