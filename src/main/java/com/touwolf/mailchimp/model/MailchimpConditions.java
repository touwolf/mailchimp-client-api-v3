package com.touwolf.mailchimp.model;

import com.google.gson.annotations.SerializedName;

public class MailchimpConditions
{
    @SerializedName("condition_type")
    private MailchimpConditionType conditionType;

    /**
     * The type of segment, for example: date, language, Mandrill, static, and more.
     *
     */
    public MailchimpConditionType getConditionType() {
        return conditionType;
    }

    public void setConditionType(MailchimpConditionType conditionType) {
        this.conditionType = conditionType;
    }
}
