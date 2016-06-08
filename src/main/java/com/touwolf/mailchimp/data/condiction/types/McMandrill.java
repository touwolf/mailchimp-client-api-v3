package com.touwolf.mailchimp.data.condiction.types;

public class McMandrill extends McParent
{
    private String op;

    private String field;

    /**
     * The segment operator.
     *
     */
    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     *
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
