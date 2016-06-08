package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McEmailClientOpEnum {
    @SerializedName("client_is")
    CLIENT_IS,
    @SerializedName("client_not")
    CLIENT_NOT
}
