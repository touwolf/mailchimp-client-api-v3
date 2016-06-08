package com.touwolf.mailchimp.data.condiction.types;

public class McConversation extends McParent {
    private McConversationOpEnum op;

    private McConversationFieldEnum field;

    private String value;

    /**
     * The status of a member’s interaction with a conversation.
     * Possible Values:
     * <p>
     * member
     * notmember
     */
    public McConversationOpEnum getOp() {
        return op;
    }

    public void setOp(McConversationOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     * <p>
     * conversation
     */
    public McConversationFieldEnum getField() {
        return field;
    }

    public void setField(McConversationFieldEnum field) {
        this.field = field;
    }

    /**
     * The web id value for a specific campaign, or ‘any’ to account for subscribers who have or have not interacted with any campaigns.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
