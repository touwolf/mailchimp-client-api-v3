package com.touwolf.mailchimp.model.list.segments;

import com.touwolf.mailchimp.data.condiction.MailchimpConditionMatch;
import com.touwolf.mailchimp.data.condiction.MailchimpConditions;

public class ListsSegmentsOptions {
    private MailchimpConditionMatch match;

    private MailchimpConditions[] conditions;

    /**
     * Segment match type.
     */
    public MailchimpConditionMatch getMatch() {
        return match;
    }

    public void setMatch(MailchimpConditionMatch match) {
        this.match = match;
    }

    /**
     * An array of segment conditions.
     */
    public MailchimpConditions[] getConditions() {
        return conditions;
    }

    public void setConditions(MailchimpConditions[] conditions) {
        this.conditions = conditions;
    }
}
