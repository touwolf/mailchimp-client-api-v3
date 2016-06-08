package com.touwolf.mailchimp.data.condiction.types;

public class McEmailClient extends McParent
{
    private McEmailClientOpEnum op;

    private McEmailClientFieldEnum field;

    private String value;

    /**
     * A member’s status, based on their campaign interactions.
     * Possible Values:
     *
     * client_is
     * client_not
     */
    public McEmailClientOpEnum getOp() {
        return op;
    }

    public void setOp(McEmailClientOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * email_client
     */
    public McEmailClientFieldEnum getField() {
        return field;
    }

    public void setField(McEmailClientFieldEnum field) {
        this.field = field;
    }

    /**
     * The name of the email client.
     *
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
