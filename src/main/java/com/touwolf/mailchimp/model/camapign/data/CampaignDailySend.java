package com.touwolf.mailchimp.model.camapign.data;

public class CampaignDailySend
{
    private Boolean sunday;

    private Boolean monday;

    private Boolean tuesday;

    private Boolean wednesday;

    private Boolean thursday;

    private Boolean friday;

    private Boolean saturday;

    /**
     * Sends the daily RSS Campaign on Sundays.
     *
     * @return
     */
    public Boolean getSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }

    /**
     * Sends the daily RSS Campaign on Mondays.
     *
     * @return
     */
    public Boolean getMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    /**
     * Sends the daily RSS Campaign on Tuesdays.
     *
     * @return
     */
    public Boolean getTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    /**
     * Sends the daily RSS Campaign on Wednesdays.
     *
     * @return
     */
    public Boolean getWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    /**
     * Sends the daily RSS Campaign on Thursdays.
     *
     * @return
     */
    public Boolean getThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    /**
     * Sends the daily RSS Campaign on Fridays.
     *
     * @return
     */
    public Boolean getFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    /**
     * Sends the daily RSS Campaign on Saturdays.
     *
     * @return
     */
    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }
}
