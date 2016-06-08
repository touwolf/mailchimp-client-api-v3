package com.touwolf.mailchimp.data.condiction.types;

public class McEcommStore extends McParent {
    private McEcommStoreOpEmum op;

    private McEcommStoreFieldEmum field;

    private String value;

    /**
     * Members who have or have not purchased from a specific store.
     * Possible Values:
     * <p>
     * is
     * not
     */
    public McEcommStoreOpEmum getOp() {
        return op;
    }

    public void setOp(McEcommStoreOpEmum op) {
        this.op = op;
    }

    /**
     * The e-commerce store field to segment on.
     * Possible Values:
     * <p>
     * ecomm_store
     */
    public McEcommStoreFieldEmum getField() {
        return field;
    }

    public void setField(McEcommStoreFieldEmum field) {
        this.field = field;
    }

    /**
     * The store id to segment on.
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
