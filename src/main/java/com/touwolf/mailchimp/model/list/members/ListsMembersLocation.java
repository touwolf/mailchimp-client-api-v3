package com.touwolf.mailchimp.model.list.members;

import com.google.gson.annotations.SerializedName;

public class ListsMembersLocation {
    private Double latitude;

    private Double longitude;

    private Integer gmtoff;

    private Integer dstoff;

    @SerializedName("country_code")
    private String countryCode;

    private String timezone;

    /**
     * The location latitude.
     */
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * The location longitude.
     */
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * The time difference in hours from GMT.
     */
    public Integer getGmtoff() {
        return gmtoff;
    }

    public void setGmtoff(Integer gmtoff) {
        this.gmtoff = gmtoff;
    }

    /**
     * The offset for timezones where daylight saving time is observed.
     */
    public Integer getDstoff() {
        return dstoff;
    }

    public void setDstoff(Integer dstoff) {
        this.dstoff = dstoff;
    }

    /**
     * The unique code for the location country.
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * The timezone for the location.
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
