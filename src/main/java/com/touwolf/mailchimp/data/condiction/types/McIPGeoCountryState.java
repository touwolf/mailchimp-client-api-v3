package com.touwolf.mailchimp.data.condiction.types;

public class McIPGeoCountryState extends McParent
{
    private McIPGeoCountryStateOpEnum op;

    private McIPGeoCountryStateFieldEnum field;

    private String value;

    /**
     * Segment members who are in a specific country or US state.
     * Possible Values:
     *
     * ipgeocountry
     * ipgeonotcountry
     * ipgeostate
     * ipgeonotstate
     */
    public McIPGeoCountryStateOpEnum getOp() {
        return op;
    }

    public void setOp(McIPGeoCountryStateOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * ipgeo
     */
    public McIPGeoCountryStateFieldEnum getField() {
        return field;
    }

    public void setField(McIPGeoCountryStateFieldEnum field) {
        this.field = field;
    }

    /**
     * The two-letter country code or US state abbreviation.
     *
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
