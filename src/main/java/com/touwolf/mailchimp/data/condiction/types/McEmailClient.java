package com.touwolf.mailchimp.data.condiction.types;

public class McEmailClient extends McParent
{
    private String op;

    private String field;

    private String value;

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
