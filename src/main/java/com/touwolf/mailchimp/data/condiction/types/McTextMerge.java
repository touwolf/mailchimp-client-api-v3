package com.touwolf.mailchimp.data.condiction.types;

public class McTextMerge extends McParent
{
    private McTextMergeOpEnum op;

    private String field;

    private String value;

    /**
     * Whether the email address is/not exactly, contains/doesn’t contain, starts/ends with a string.
     * Possible Values:
     *
     * is
     * not
     * contains
     * notcontain
     * starts
     * ends
     * greater
     * less
     * blank
     * blank_not
     */
    public McTextMergeOpEnum getOp() {
        return op;
    }

    public void setOp(McTextMergeOpEnum op) {
        this.op = op;
    }

    /**
     * The segment field, one of ‘merge0’ or ‘EMAIL’.
     *
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    /**
     * The value to compare.
     *
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
