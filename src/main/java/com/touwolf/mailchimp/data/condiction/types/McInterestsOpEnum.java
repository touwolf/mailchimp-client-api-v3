package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McInterestsOpEnum
{
    @SerializedName("interestcontains")
    INTEREST_CONTAINS,
    @SerializedName("interestcontainsall")
    INTEREST_CONTAINS_ALL,
    @SerializedName("interestnotcontains")
    INTEREST_NOT_CONTAINS
}
