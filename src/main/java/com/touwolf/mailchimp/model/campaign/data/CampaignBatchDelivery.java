package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

public class CampaignBatchDelivery
{
    @SerializedName("batch_delay")
    private Integer batchDelay;

    @SerializedName("batch_count")
    private Integer batchCount;

    /**
     * The delay, in minutes, between batches.
     *
     * @return
     */
    public Integer getBatchDelay() {
        return batchDelay;
    }

    public void setBatchDelay(Integer batchDelay) {
        this.batchDelay = batchDelay;
    }

    /**
     * The number of batches for the campaign send.
     *
     * @return
     */
    public Integer getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
    }
}
