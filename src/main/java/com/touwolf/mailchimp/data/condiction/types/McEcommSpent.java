package com.touwolf.mailchimp.data.condiction.types;

public class McEcommSpent extends McParent
{
    private McEcommSpentOpEnum op;

    private McEcommSpentFieldEnum field;

    private Integer value;

    /**
     * Members who have spent more or less than the set value.
     * Possible Values:
     *
     * greater
     * less
     */
    public McEcommSpentOpEnum getOp() {
        return op;
    }

    public void setOp(McEcommSpentOpEnum op) {
        this.op = op;
    }

    /**
     * The e-commerce spent field to segment on.
     * Possible Values:
     *
     * ecomm_spent_one
     * ecomm_spent_all
     */
    public McEcommSpentFieldEnum getField() {
        return field;
    }

    public void setField(McEcommSpentFieldEnum field) {
        this.field = field;
    }

    /**
     * The total amount a member spent.
     *
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
