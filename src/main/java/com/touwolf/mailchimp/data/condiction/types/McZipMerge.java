package com.touwolf.mailchimp.data.condiction.types;

public class McZipMerge extends McParent {
    private McZipMergeOpEnum op;

    private String field;

    private String extra;

    private String value;

    /**
     * Whether the zip value is in a specific location.
     * Possible Values:
     * <p>
     * geoin
     */
    public McZipMergeOpEnum getOp() {
        return op;
    }

    public void setOp(McZipMergeOpEnum op) {
        this.op = op;
    }

    /**
     * The zip merge segment field.
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    /**
     * The city or the zip being used to segment on.
     */
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
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
