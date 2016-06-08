package com.touwolf.mailchimp.data.condiction.types;

public class McVip extends McParent
{
    private McVipOpEnum op;

    private McVipFieldEnum field;

    /**
     * Whether the member is or isn’t a VIP.
     * Possible Values:
     *
     * member
     * notmember
     */
    public McVipOpEnum getOp() {
        return op;
    }

    public void setOp(McVipOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * gmonkey
     */
    public McVipFieldEnum getField() {
        return field;
    }

    public void setField(McVipFieldEnum field) {
        this.field = field;
    }
}
