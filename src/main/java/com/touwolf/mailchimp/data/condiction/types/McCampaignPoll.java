package com.touwolf.mailchimp.data.condiction.types;

public class McCampaignPoll extends McParent
{
    private McCampaignPollOpEnum op;

    private McCampaignPollFieldEnum field;

    private Long value;

    /**
     * Members who have or have not interacted with a specific poll in a MailChimp email.
     * Possible Values:
     *
     * member
     * notmember
     */
    public McCampaignPollOpEnum getOp() {
        return op;
    }

    public void setOp(McCampaignPollOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * poll
     */
    public McCampaignPollFieldEnum getField() {
        return field;
    }

    public void setField(McCampaignPollFieldEnum field) {
        this.field = field;
    }

    /**
     * The id for the poll.
     *
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
