package com.touwolf.mailchimp.data.condiction.types;

public class McDate extends McParent {
    private McDateOpEnum op;

    private McDateFieldEnum field;

    private String extra;

    private McDateValueEnum value;

    /**
     * When the event took place.
     * Possible Values:
     * <p>
     * greater
     * less
     * is
     * not
     * blank
     * blank_not
     */
    public McDateOpEnum getOp() {
        return op;
    }

    public void setOp(McDateOpEnum op) {
        this.op = op;
    }

    /**
     * The date segment field.
     * Possible Values:
     * <p>
     * timestamp_opt
     * info_changed
     * ecomm_date
     */
    public McDateFieldEnum getField() {
        return field;
    }

    public void setField(McDateFieldEnum field) {
        this.field = field;
    }

    /**
     * When segmenting on ‘date’ or ‘campaign’, the date for the segment formatted as YYYY-MM-DD or the web id for the campaign.
     */
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    /**
     * What type of data to segment on: a specific date, a specific campaign, or the last campaign sent.
     * Possible Values:
     * <p>
     * date
     * campaign
     * last
     */
    public McDateValueEnum getValue() {
        return value;
    }

    public void setValue(McDateValueEnum value) {
        this.value = value;
    }
}
