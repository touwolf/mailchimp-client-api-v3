package com.touwolf.mailchimp.data.condiction.types;

public class McBirthdayMerge extends McParent {
    private McBirthdayMergeOpEnum op;

    private String field;

    private String value;

    /**
     * Whether the segment value matches exactly, doesn’t match, is blank, or isn’t blank.
     * Possible Values:
     * <p>
     * is
     * not
     * blank
     * blank_not
     */
    public McBirthdayMergeOpEnum getOp() {
        return op;
    }

    public void setOp(McBirthdayMergeOpEnum op) {
        this.op = op;
    }

    /**
     * The birthday merge segment field.
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    /**
     * The value to compare.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
