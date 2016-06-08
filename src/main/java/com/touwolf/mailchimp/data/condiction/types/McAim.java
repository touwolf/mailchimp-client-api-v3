package com.touwolf.mailchimp.data.condiction.types;

public class McAim extends McParent {
    private McAimOpEnum op;

    private McAimFieldEnum field;

    private String value;

    /**
     * The member’s status, based on their campaign interaction.
     * Possible Values:
     * <p>
     * open
     * click
     * sent
     * noopen
     * noclick
     * nosent
     */
    public McAimOpEnum getOp() {
        return op;
    }

    public void setOp(McAimOpEnum op) {
        this.op = op;
    }

    /**
     * The segment field, ‘aim’.
     * Possible Values:
     * <p>
     * aim
     */
    public McAimFieldEnum getField() {
        return field;
    }

    public void setField(McAimFieldEnum field) {
        this.field = field;
    }

    /**
     * Either the web id value for a specific campaign or ‘any’ to account for subscribers who have or have not interacted with any campaigns.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
