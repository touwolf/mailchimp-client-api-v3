package com.touwolf.mailchimp.data.condiction.types;

public class McAutomation extends McParent {
    private McAutomationOpEnum op;

    private McAutomationFieldEnum field;

    private String value;

    /**
     * The member’s status, based on where they are in an Automation workflow.
     * Possible Values:
     * <p>
     * started
     * completed
     * not_started
     * not_completed
     */
    public McAutomationOpEnum getOp() {
        return op;
    }

    public void setOp(McAutomationOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     * <p>
     * automation
     */
    public McAutomationFieldEnum getField() {
        return field;
    }

    public void setField(McAutomationFieldEnum field) {
        this.field = field;
    }

    /**
     * The web id for the Automation workflow to segment on.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
