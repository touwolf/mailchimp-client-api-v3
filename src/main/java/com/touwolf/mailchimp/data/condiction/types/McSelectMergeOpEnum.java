package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McSelectMergeOpEnum {
    @SerializedName("is")
    IS,
    @SerializedName("not")
    NOT,
    @SerializedName("blank")
    BLANK,
    @SerializedName("blank_not")
    BLANK_NOT
}
