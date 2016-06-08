package com.touwolf.mailchimp.data.condiction.types;

public class McGoalActivity extends McParent {
    private McGoalActivityOpEnum op;

    private McGoalActivityFieldEnum field;

    private String value;

    /**
     * Whether the website URL is/not exactly, contains/doesn’t contain, starts with/ends with a string.
     * Possible Values:
     * <p>
     * is
     * goal_not
     * contains
     * goal_notcontain
     * starts
     * ends
     */
    public McGoalActivityOpEnum getOp() {
        return op;
    }

    public void setOp(McGoalActivityOpEnum op) {
        this.op = op;
    }

    /**
     * The goal activity field to segment on.
     * Possible Values:
     * <p>
     * goal
     */
    public McGoalActivityFieldEnum getField() {
        return field;
    }

    public void setField(McGoalActivityFieldEnum field) {
        this.field = field;
    }

    /**
     * The URL to check Goal activity against.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
