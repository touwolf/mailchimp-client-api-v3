package com.touwolf.mailchimp.data.condiction.types;

public class McStaticSegment extends McParent {
    private McStaticSegmentOpEnum op;

    private McStaticSegmentFieldEnum field;

    private Long value;

    /**
     * Members who are/are not apart of a static segment.
     * Possible Values:
     * <p>
     * static_is
     * static_not
     */
    public McStaticSegmentOpEnum getOp() {
        return op;
    }

    public void setOp(McStaticSegmentOpEnum op) {
        this.op = op;
    }

    /**
     * The static segment field.
     * Possible Values:
     * <p>
     * static_segment
     */
    public McStaticSegmentFieldEnum getField() {
        return field;
    }

    public void setField(McStaticSegmentFieldEnum field) {
        this.field = field;
    }

    /**
     * The id for the static segment.
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
