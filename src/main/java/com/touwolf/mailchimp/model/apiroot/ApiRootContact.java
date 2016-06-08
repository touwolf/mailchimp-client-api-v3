package com.touwolf.mailchimp.model.apiroot;

public class ApiRootContact {
    private String company;

    private String addr1;

    private String addr2;

    private String city;

    private String state;

    private String zip;

    private String country;

    /**
     * The company name for the account.
     *
     */
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * The street address for the account contact.
     *
     */
    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    /**
     * The street address for the account contact.
     *
     */
    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    /**
     * The city for the account contact.
     *
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The state for the account contact.
     *
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * The zip code for the account contact.
     *
     */
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * The country for the account contact.
     *
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
