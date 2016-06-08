package com.touwolf.mailchimp.data.condiction.types;

public class McSignupSource extends McParent {
    private McSignupSourceOpEnum op;

    private McSignupSourceFieldEnum field;

    private String value;

    /**
     * Whether the member’s signup source was/was not a particular value.
     * Possible Values:
     * <p>
     * source_is
     * source_not
     */
    public McSignupSourceOpEnum getOp() {
        return op;
    }

    public void setOp(McSignupSourceOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     * <p>
     * source
     */
    public McSignupSourceFieldEnum getField() {
        return field;
    }

    public void setField(McSignupSourceFieldEnum field) {
        this.field = field;
    }

    /**
     * The signup source.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
