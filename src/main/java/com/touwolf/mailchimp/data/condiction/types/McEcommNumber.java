package com.touwolf.mailchimp.data.condiction.types;

public class McEcommNumber extends McParent {
    private McEcommNumberOpEnum op;

    private McEcommNumberFieldEnum field;

    private Double value;

    /**
     * Members who have spent exactly, have not spent exactly, spent more, or spent less than the segment value.
     * Possible Values:
     * <p>
     * is
     * not
     * greater
     * less
     */
    public McEcommNumberOpEnum getOp() {
        return op;
    }

    public void setOp(McEcommNumberOpEnum op) {
        this.op = op;
    }

    /**
     * The e-commerce number field to segment on.
     * Possible Values:
     * <p>
     * ecomm_spent_avg
     * ecomm_orders
     * ecomm_prod_all
     * ecomm_avg_ord
     */
    public McEcommNumberFieldEnum getField() {
        return field;
    }

    public void setField(McEcommNumberFieldEnum field) {
        this.field = field;
    }

    /**
     * Members who have spent exactly, have not spent exactly, spent more, or spent less than this amount.
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
