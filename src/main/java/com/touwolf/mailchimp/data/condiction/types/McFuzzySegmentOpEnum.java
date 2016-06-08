package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McFuzzySegmentOpEnum
{
    @SerializedName("fuzzy_is")
    FUZZY_IS,
    @SerializedName("fuzzy_not")
    FUZZY_NOT
}
