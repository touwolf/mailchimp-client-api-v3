package com.touwolf.mailchimp.data.condiction.types;

public class McEcommCategory extends McParent
{
    private McEcommCategoryOpEnum op;

    private McEcommCategoryFieldEnum field;

    private String value;

    /**
     * A member who has purchased from a category or purchased a specific item.
     * Possible Values:
     *
     * is
     * not
     * contains
     * notcontain
     * starts
     * ends
     */
    public McEcommCategoryOpEnum getOp() {
        return op;
    }

    public void setOp(McEcommCategoryOpEnum op) {
        this.op = op;
    }

    /**
     * The e-commerce category or product segment field.
     * Possible Values:
     *
     * ecomm_cat
     * ecomm_prod
     */
    public McEcommCategoryFieldEnum getField() {
        return field;
    }

    public void setField(McEcommCategoryFieldEnum field) {
        this.field = field;
    }

    /**
     * The e-commerce category or item information.
     *
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
