package com.touwolf.mailchimp.data.condiction.types;

public class McIPGeoUnknown extends McParent
{
    private McIPGeoUnknownOpEnum op;

    private McIPGeoUnknownFieldEnum field;

    /**
     * Segment members with unknown location information.
     * Possible Values:
     *
     * ipgeounknown
     */
    public McIPGeoUnknownOpEnum getOp() {
        return op;
    }

    public void setOp(McIPGeoUnknownOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * ipgeo
     */
    public McIPGeoUnknownFieldEnum getField() {
        return field;
    }

    public void setField(McIPGeoUnknownFieldEnum field) {
        this.field = field;
    }
}
