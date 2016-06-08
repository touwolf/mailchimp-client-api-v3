package com.touwolf.mailchimp.data.condiction.types;

public class McIPGeoZip extends McParent
{
    private McIPGeoZipOpEnum op;

    private McIPGeoZipFieldEnum field;

    private Integer value;

    /**
     * Segment members who are or are not in a specific US zip code.
     * Possible Values:
     *
     * ipgeoiszip
     * ipgeonotzip
     */
    public McIPGeoZipOpEnum getOp() {
        return op;
    }

    public void setOp(McIPGeoZipOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * ipgeo
     */
    public McIPGeoZipFieldEnum getField() {
        return field;
    }

    public void setField(McIPGeoZipFieldEnum field) {
        this.field = field;
    }

    /**
     * The 5-digit zip code.
     *
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
