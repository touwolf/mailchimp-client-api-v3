package com.touwolf.mailchimp.data.condiction.types;

public class McEmailAddress extends McParent {
    private McEmailAddressOpEnum op;

    private McEmailAddressFieldEnum field;

    private String value;

    /**
     * Whether the email address is/not exactly, contains/doesn’t contain, starts/ends with a string.
     * Possible Values:
     * <p>
     * is
     * not
     * contains
     * notcontain
     * starts
     * ends
     * greater
     * less
     */
    public McEmailAddressOpEnum getOp() {
        return op;
    }

    public void setOp(McEmailAddressOpEnum op) {
        this.op = op;
    }

    /**
     * The segment field, one of ‘merge0’ or ‘EMAIL’.
     * Possible Values:
     * <p>
     * merge0
     * EMAIL
     */
    public McEmailAddressFieldEnum getField() {
        return field;
    }

    public void setField(McEmailAddressFieldEnum field) {
        this.field = field;
    }

    /**
     * The value to compare the email against.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
