package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McSocialInfluenceOpEnum {
    @SerializedName("is")
    IS,
    @SerializedName("not")
    NOT,
    @SerializedName("greater")
    GEEATER,
    @SerializedName("less")
    LESS
}
