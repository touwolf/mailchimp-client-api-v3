package com.touwolf.mailchimp.data.condiction.types;

public class McSocialInfluence extends McParent {
    private McSocialInfluenceOpEnum op;

    private McSocialInfluenceFieldEnum field;

    private String value;

    /**
     * Members who have a rating that is/not or greater/less than the rating provided.
     * Possible Values:
     * <p>
     * is
     * not
     * greater
     * less
     */
    public McSocialInfluenceOpEnum getOp() {
        return op;
    }

    public void setOp(McSocialInfluenceOpEnum op) {
        this.op = op;
    }

    /**
     * The social influence field to segment on.
     * Possible Values:
     * <p>
     * social_influence
     */
    public McSocialInfluenceFieldEnum getField() {
        return field;
    }

    public void setField(McSocialInfluenceFieldEnum field) {
        this.field = field;
    }

    /**
     * The Social Profiles influence rating to segment on.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
