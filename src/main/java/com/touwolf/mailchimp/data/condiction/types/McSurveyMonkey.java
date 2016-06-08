package com.touwolf.mailchimp.data.condiction.types;

public class McSurveyMonkey extends McParent
{
    private McSurveyMonkeyOpEnum op;

    private McSurveyMonkeyFieldEnum field;

    private String value;

    /**
     * A member’s status based on whether they have started, completed, not started, or not completed a specific survey.
     * Possible Values:
     *
     * started
     * completed
     * not_started
     * not_completed
     */
    public McSurveyMonkeyOpEnum getOp() {
        return op;
    }

    public void setOp(McSurveyMonkeyOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * survey_monkey
     */
    public McSurveyMonkeyFieldEnum getField() {
        return field;
    }

    public void setField(McSurveyMonkeyFieldEnum field) {
        this.field = field;
    }

    /**
     * The unique ID of the SurveyMonkey survey.
     *
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
