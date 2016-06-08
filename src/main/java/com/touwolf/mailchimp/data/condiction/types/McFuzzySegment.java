package com.touwolf.mailchimp.data.condiction.types;

public class McFuzzySegment extends McParent {
    private McFuzzySegmentOpEnum op;

    private McFuzzySegmentFieldEnum field;

    private Long value;

    /**
     * Members who are/are not apart of a ‘similar subscribers’ segment.
     * Possible Values:
     * <p>
     * fuzzy_is
     * fuzzy_not
     */
    public McFuzzySegmentOpEnum getOp() {
        return op;
    }

    public void setOp(McFuzzySegmentOpEnum op) {
        this.op = op;
    }

    /**
     * The fuzzy segment field.
     * Possible Values:
     * <p>
     * fuzzy_segment
     */
    public McFuzzySegmentFieldEnum getField() {
        return field;
    }

    public void setField(McFuzzySegmentFieldEnum field) {
        this.field = field;
    }

    /**
     * The id for the ‘similar subscribers’ segment.
     */
    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
