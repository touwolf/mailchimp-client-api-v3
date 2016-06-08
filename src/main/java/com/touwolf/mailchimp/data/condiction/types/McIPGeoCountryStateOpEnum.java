package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McIPGeoCountryStateOpEnum {
    @SerializedName("ipgeocountry")
    IP_GEO_COUNTRY,
    @SerializedName("ipgeonotcountry")
    IP_GEO_NOT_COUNTRY,
    @SerializedName("ipgeostate")
    IP_GEO_STATE,
    @SerializedName("ipgeonotstate")
    IP_GEO_NOT_STATE
}
