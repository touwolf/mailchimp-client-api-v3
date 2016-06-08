package com.touwolf.mailchimp.data.condiction.types;

public class McDateMerge extends McParent {
    private McDateMergeOpEnum op;

    private String field;

    private String value;

    /**
     * Whether the segment value matches exactly, doesn’t match, is blank, or isn’t blank.
     * Possible Values:
     * <p>
     * is
     * not
     * less
     * blank
     * blank_not
     */
    public McDateMergeOpEnum getOp() {
        return op;
    }

    public void setOp(McDateMergeOpEnum op) {
        this.op = op;
    }

    /**
     * The date merge segment field.
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
