package com.touwolf.mailchimp.model.list.members;

import com.google.gson.annotations.SerializedName;

public class ListsMembersStats {
    @SerializedName("avg_open_rate")
    private Double avgOpenRate;

    @SerializedName("avg_click_rate")
    private Double avgClickRate;

    /**
     * A subscriber’s average open rate.
     */
    public Double getAvgOpenRate() {
        return avgOpenRate;
    }

    public void setAvgOpenRate(Double avgOpenRate) {
        this.avgOpenRate = avgOpenRate;
    }

    /**
     * A subscriber’s average clickthrough rate.
     */
    public Double getAvgClickRate() {
        return avgClickRate;
    }

    public void setAvgClickRate(Double avgClickRate) {
        this.avgClickRate = avgClickRate;
    }
}
