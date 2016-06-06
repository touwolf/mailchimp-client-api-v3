package com.touwolf.mailchimp.model.list.data.mergefields;

import com.google.gson.annotations.SerializedName;

public class ListsMergeFieldsOptions
{
    @SerializedName("default_country")
    private Integer defaultCountry;

    @SerializedName("phone_format")
    private String phoneFormat;

    @SerializedName("date_format")
    private String dateFormat;

    private String[] choices;

    private Integer size;

    /**
     * In an address field, the default country code if none supplied.
     *
     */
    public Integer getDefaultCountry() {
        return defaultCountry;
    }

    public void setDefaultCountry(Integer defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    /**
     * In a phone field, the phone number type: US or International.
     *
     */
    public String getPhoneFormat() {
        return phoneFormat;
    }

    public void setPhoneFormat(String phoneFormat) {
        this.phoneFormat = phoneFormat;
    }

    /**
     * In a date or birthday field, the format of the date.
     *
     */
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * In a radio or dropdown non-group field, the available options for members to pick from.
     *
     */
    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    /**
     * In a text field, the default length of the text field.
     *
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
