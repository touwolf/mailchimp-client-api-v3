package com.touwolf.mailchimp.data.condiction.types;

public class McLanguage extends McParent
{
    private McLanguageOpEnum op;

    private McLanguageFieldEnum field;

    private String value;

    /**
     * Whether the member’s language is or isn’t set to a specific language.
     * Possible Values:
     *
     * is
     * not
     */
    public McLanguageOpEnum getOp() {
        return op;
    }

    public void setOp(McLanguageOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * language
     */
    public McLanguageFieldEnum getField() {
        return field;
    }

    public void setField(McLanguageFieldEnum field) {
        this.field = field;
    }

    /**
     * A two-letter language identifier.
     *
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
