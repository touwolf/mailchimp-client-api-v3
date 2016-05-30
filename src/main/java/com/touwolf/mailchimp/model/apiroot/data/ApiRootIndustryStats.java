package com.touwolf.mailchimp.model.apiroot.data;

import com.google.gson.annotations.SerializedName;

public class ApiRootIndustryStats
{
    @SerializedName("open_rate")
    private Double openRate;

    @SerializedName("bounce_rate")
    private Double bounceRate;

    @SerializedName("click_rate")
    private Double clickRate;

    /**
     * The average unique open rate for all campaigns in the account’s specified industry.
     *
     * @return
     */
    public Double getOpenRate() {
        return openRate;
    }

    public void setOpenRate(Double openRate) {
        this.openRate = openRate;
    }

    /**
     * The average bounce rate for all campaigns in the account’s specified industry.
     *
     * @return
     */
    public Double getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(Double bounceRate) {
        this.bounceRate = bounceRate;
    }

    /**
     * The average unique click rate for all campaigns in the account’s specified industry.
     *
     * @return
     */
    public Double getClickRate() {
        return clickRate;
    }

    public void setClickRate(Double clickRate) {
        this.clickRate = clickRate;
    }
}
