package com.touwolf.mailchimp.model.list.data;

public class ListsContact
{
    private String company;

    private String address1;

    private String address2;

    private String city;

    private String state;

    private String zip;

    private String country;

    private String phone;

    /**
     * The company name for the list.
      *
     */
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * The street address for the list contact.
     *
     */
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * The street address for the list contact.
     *
     */
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * The city for the list contact.
     *
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The state for the list contact.
     *
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * The postal or zip code for the list contact.
     *
     */
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * A two-character ISO3166 country code. Defaults to US if invalid.
     *
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * The phone number for the list contact.
     *
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
