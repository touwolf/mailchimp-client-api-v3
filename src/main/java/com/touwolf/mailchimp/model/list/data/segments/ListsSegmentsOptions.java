package com.touwolf.mailchimp.model.list.data.segments;

import com.touwolf.mailchimp.model.MailchimpConditions;

public class ListsSegmentsOptions
{
    private String match;

    private MailchimpConditions[] conditions;

    /**
     * Segment match type.
     *
     */
    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    /**
     * An array of segment conditions.
     *
     */
    public MailchimpConditions[] getConditions() {
        return conditions;
    }

    public void setConditions(MailchimpConditions[] conditions) {
        this.conditions = conditions;
    }
}
