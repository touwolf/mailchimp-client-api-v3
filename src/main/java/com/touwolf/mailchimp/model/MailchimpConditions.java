package com.touwolf.mailchimp.model;

import com.google.gson.annotations.SerializedName;

public class MailchimpConditions
{
    @SerializedName("condition_type")
    private String conditionType;

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }
}
