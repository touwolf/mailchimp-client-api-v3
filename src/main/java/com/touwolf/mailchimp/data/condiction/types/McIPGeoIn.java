package com.touwolf.mailchimp.data.condiction.types;

public class McIPGeoIn extends McParent {
    private McIPGeoInOpEnum op;

    private String lng;

    private McIPGeoInFieldEnum field;

    private String addr;

    private Integer value;

    private String lat;

    /**
     * Segment members who are in a specific geographic region.
     * Possible Values:
     * <p>
     * ipgeoin
     * ipgeonotin
     */
    public McIPGeoInOpEnum getOp() {
        return op;
    }

    public void setOp(McIPGeoInOpEnum op) {
        this.op = op;
    }

    /**
     * The longitude of the target location.
     */
    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     * The field to segment on.
     * Possible Values:
     * <p>
     * ipgeo
     */
    public McIPGeoInFieldEnum getField() {
        return field;
    }

    public void setField(McIPGeoInFieldEnum field) {
        this.field = field;
    }

    /**
     * The address of the target location.
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * The radius of the target location.
     */
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * The latitude of the target location.
     */
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
