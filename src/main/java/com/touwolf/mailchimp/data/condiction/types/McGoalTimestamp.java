package com.touwolf.mailchimp.data.condiction.types;

public class McGoalTimestamp extends McParent {
    private McGoalTimestampOpEnum op;

    private McGoalTimestampFieldEnum field;

    private String value;

    /**
     * Whether the website activity happened at, after, or before a specific timestamp.
     * Possible Values:
     * <p>
     * greater
     * less
     * is
     */
    public McGoalTimestampOpEnum getOp() {
        return op;
    }

    public void setOp(McGoalTimestampOpEnum op) {
        this.op = op;
    }

    /**
     * The goal time field to segment on.
     * Possible Values:
     * <p>
     * goal_last_visited
     */
    public McGoalTimestampFieldEnum getField() {
        return field;
    }

    public void setField(McGoalTimestampFieldEnum field) {
        this.field = field;
    }

    /**
     * The date to check Goal activity against.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
