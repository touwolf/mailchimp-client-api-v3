package com.touwolf.mailchimp.data.condiction.types;

public class McIPGeoInZip extends McParent
{
    private McIPGeoInZipOpEnum op;

    private McIPGeoInZipFieldEnum field;

    private Integer extra;

    private Integer value;

    /**
     * Segment members who are in a specific US zip code.
     * Possible Values:
     *
     * ipgeoinzip
     */
    public McIPGeoInZipOpEnum getOp() {
        return op;
    }

    public void setOp(McIPGeoInZipOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * ipgeo
     */
    public McIPGeoInZipFieldEnum getField() {
        return field;
    }

    public void setField(McIPGeoInZipFieldEnum field) {
        this.field = field;
    }

    /**
     * The zip code to segment on.
     *
     */
    public Integer getExtra() {
        return extra;
    }

    public void setExtra(Integer extra) {
        this.extra = extra;
    }

    /**
     * The radius of the target location.
     *
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
