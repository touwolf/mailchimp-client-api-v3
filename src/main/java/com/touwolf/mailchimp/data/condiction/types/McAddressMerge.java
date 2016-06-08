package com.touwolf.mailchimp.data.condiction.types;

public class McAddressMerge extends McParent
{
    private McAddressMergeOpEnum op;

    private String field;

    private String value;

    /**
     * Whether the segment value contains, doesn’t contain, is blank, or isn’t blank.
     * Possible Values:
     *
     * contains
     * notcontain
     * blank
     * blank_not
     */
    public McAddressMergeOpEnum getOp() {
        return op;
    }

    public void setOp(McAddressMergeOpEnum op) {
        this.op = op;
    }

    /**
     * The address merge segment field.
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
