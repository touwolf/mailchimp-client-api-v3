package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;

public enum McEcommNumberFieldEnum {
    @SerializedName("ecomm_spent_avg")
    ECOMM_SPENT_AVG,
    @SerializedName("ecomm_orders")
    ECOMM_ORDERS,
    @SerializedName("ecomm_prod_all")
    ECOMM_PROD_ALL,
    @SerializedName("ecomm_avg_ord")
    ECOMM_AVG_ORD
}
