package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

class CampaignSchedule
{
    private Integer hour;

    @SerializedName("daily_send")
    private CampaignDailySend dailySend;

    @SerializedName("weekly_send_day")
    private String weeklySendDay;

    @SerializedName("monthly_send_date")
    private Integer monthlySendDate;

    /**
     * The hour to send the campaign in local time. Acceptable hours are 0-23. For example, ‘4’
     * would be 4am in your account’s default time zone.
     *
     */
    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    /**
     * The days of the week to send a daily RSS Campaign.
     *
     */
    public CampaignDailySend getDailySend() {
        return dailySend;
    }

    public void setDailySend(CampaignDailySend dailySend) {
        this.dailySend = dailySend;
    }

    /**
     * The day of the week to send a weekly RSS Campaign.
     * Possible Values:
     *
     * sunday
     * monday
     * tuesday
     * wednesday
     * thursday
     * friday
     * saturday
     *
     */
    public String getWeeklySendDay() {
        return weeklySendDay;
    }

    public void setWeeklySendDay(String weeklySendDay) {
        this.weeklySendDay = weeklySendDay;
    }

    /**
     * The day of the month to send a monthly RSS Campaign. Acceptable days are 1-32, where ‘0’ is always the last day of a month.
     * Months with fewer than the selected number of days will not have an RSS campaign sent out that day.
     * For example, RSS Campaigns set to send on the 30th will not go out in February.
     *
     */
    public Integer getMonthlySendDate() {
        return monthlySendDate;
    }

    public void setMonthlySendDate(Integer monthlySendDate) {
        this.monthlySendDate = monthlySendDate;
    }
}
