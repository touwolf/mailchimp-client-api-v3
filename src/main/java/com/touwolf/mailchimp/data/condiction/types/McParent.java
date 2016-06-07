package com.touwolf.mailchimp.data.condiction.types;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.condiction.MailchimpConditionType;

public class McParent
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
