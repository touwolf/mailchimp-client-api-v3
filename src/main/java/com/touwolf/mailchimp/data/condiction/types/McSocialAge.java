package com.touwolf.mailchimp.data.condiction.types;

public class McSocialAge extends McParent {
    private McSocialAgeOpEnum op;

    private McSocialAgeFieldEnum field;

    private String value;

    /**
     * Members who do or don’t match the exact criteria listed.
     * Possible Values:
     * <p>
     * is
     * not
     */
    public McSocialAgeOpEnum getOp() {
        return op;
    }

    public void setOp(McSocialAgeOpEnum op) {
        this.op = op;
    }

    /**
     * The social age field to segment on.
     * Possible Values:
     * <p>
     * social_age
     */
    public McSocialAgeFieldEnum getField() {
        return field;
    }

    public void setField(McSocialAgeFieldEnum field) {
        this.field = field;
    }

    /**
     * The age range to segment.
     * Possible Values:
     * <p>
     * 18-24
     * 25-34
     * 35-54
     * 55+
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
