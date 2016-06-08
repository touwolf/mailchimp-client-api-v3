package com.touwolf.mailchimp.data.condiction.types;

public class McEcommPurchased extends McParent
{
    private McEcommPurchasedOpEnum op;

    private McEcommPurchasedFiledEnum field;

    /**
     * Members who have have (‘member’) or have not (‘notmember’) purchased.
     * Possible Values:
     *
     * member
     * notmember
     */
    public McEcommPurchasedOpEnum getOp() {
        return op;
    }

    public void setOp(McEcommPurchasedOpEnum op) {
        this.op = op;
    }

    /**
     * The e-commerce purchased field to segment on.
     * Possible Values:
     *
     * ecomm_purchased
     */
    public McEcommPurchasedFiledEnum getField() {
        return field;
    }

    public void setField(McEcommPurchasedFiledEnum field) {
        this.field = field;
    }
}
