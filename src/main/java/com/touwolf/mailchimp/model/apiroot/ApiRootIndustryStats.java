package com.touwolf.mailchimp.model.apiroot;

import com.google.gson.annotations.SerializedName;

public class ApiRootIndustryStats
{
    @SerializedName("open_rate")
    private Double openRate;

    @SerializedName("bounce_rate")
    private Double bounceRate;

    @SerializedName("click_rate")
    private Double clickRate;

    public Double getOpenRate() {
        return openRate;
    }

    public void setOpenRate(Double openRate) {
        this.openRate = openRate;
    }

    public Double getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(Double bounceRate) {
        this.bounceRate = bounceRate;
    }

    public Double getClickRate() {
        return clickRate;
    }

    public void setClickRate(Double clickRate) {
        this.clickRate = clickRate;
    }
}
