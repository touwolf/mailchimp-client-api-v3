package com.touwolf.mailchimp.model.list.interestcategories;

import com.google.gson.annotations.SerializedName;

public enum ListsInterestCategoriesTypeEnum {
    @SerializedName("checkboxes")
    CHECK_BOXES,
    @SerializedName("dropdown")
    DROP_DOWN,
    @SerializedName("radio")
    RADIO,
    @SerializedName("hidden")
    HIDDEN
}
