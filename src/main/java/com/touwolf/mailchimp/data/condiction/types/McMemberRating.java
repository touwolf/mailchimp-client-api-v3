package com.touwolf.mailchimp.data.condiction.types;

public class McMemberRating extends McParent
{
    private McMemberRatingOpEnum op;

    private McMemberRatingFieldEnum field;

    private String value;

    /**
     * Members who have have a rating that is/not exactly a specific number or members who have a rating greater/less than a specific number.
     * Possible Values:
     *
     * is
     * not
     * greater
     * less
     */
    public McMemberRatingOpEnum getOp() {
        return op;
    }

    public void setOp(McMemberRatingOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * rating
     */
    public McMemberRatingFieldEnum getField() {
        return field;
    }

    public void setField(McMemberRatingFieldEnum field) {
        this.field = field;
    }

    /**
     * The star rating number to segment on.
     *
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
