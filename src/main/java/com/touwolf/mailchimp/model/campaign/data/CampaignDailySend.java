package com.touwolf.mailchimp.model.campaign.data;

class CampaignDailySend
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
     */
    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }
}
