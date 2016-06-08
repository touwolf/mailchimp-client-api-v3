package com.touwolf.mailchimp.data.condiction.types;

public class McSocialGender extends McParent
{
    private McSocialGenderOpEnum op;

    private McSocialGenderFieldEnum field;

    private McSocialGenderValueEnum value;

    /**
     * Members who do or don’t match the exact criteria listed.
     * Possible Values:
     *
     * is
     * not
     */
    public McSocialGenderOpEnum getOp() {
        return op;
    }

    public void setOp(McSocialGenderOpEnum op) {
        this.op = op;
    }

    /**
     * The social gender field to segment on.
     * Possible Values:
     *
     * social_gender
     */
    public McSocialGenderFieldEnum getField() {
        return field;
    }

    public void setField(McSocialGenderFieldEnum field) {
        this.field = field;
    }

    /**
     * The Social Profiles gender to segment.
     * Possible Values:
     *
     * male
     * female
     */
    public McSocialGenderValueEnum getValue() {
        return value;
    }

    public void setValue(McSocialGenderValueEnum value) {
        this.value = value;
    }
}
