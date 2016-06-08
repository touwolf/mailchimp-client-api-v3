package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McConversationOpEnum
{
    @SerializedName("member")
    MEMBER,
    @SerializedName("notmember")
    NOTMEMBER
}
