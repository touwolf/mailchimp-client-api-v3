package com.touwolf.mailchimp.model.list;

import com.google.gson.annotations.SerializedName;

public class ListsStats {
    @SerializedName("member_count")
    private Integer memberCount;

    @SerializedName("unsubscribe_count")
    private Integer unsubscribeCount;

    @SerializedName("cleaned_count")
    private Integer cleanedCount;

    @SerializedName("member_count_since_send")
    private Integer memberCountSinceSend;

    @SerializedName("unsubscribe_count_since_send")
    private Integer unsubscribeCountSinceSend;

    @SerializedName("cleaned_count_since_send")
    private Integer cleanedCountSinceSend;

    @SerializedName("campaign_count")
    private Integer campaignCount;

    @SerializedName("campaign_last_sent")
    private String campaignLastSent;

    @SerializedName("merge_field_count")
    private Integer mergeFieldCount;

    @SerializedName("avg_sub_rate")
    private Double avgSubRate;

    @SerializedName("avg_unsub_rate")
    private Double avgUnsubRate;

    @SerializedName("target_sub_rate")
    private Double targetSubRate;

    @SerializedName("open_rate")
    private Double openRate;

    @SerializedName("click_rate")
    private Double clickRate;

    @SerializedName("last_sub_date")
    private String lastSubDate;

    @SerializedName("last_unsub_date")
    private String lastUnsubDate;

    /**
     * The number of active members in the list.
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    /**
     * The number of members who have unsubscribed from the list.
     */
    public Integer getUnsubscribeCount() {
        return unsubscribeCount;
    }

    public void setUnsubscribeCount(Integer unsubscribeCount) {
        this.unsubscribeCount = unsubscribeCount;
    }

    /**
     * The number of members cleaned from the list.
     */
    public Integer getCleanedCount() {
        return cleanedCount;
    }

    public void setCleanedCount(Integer cleanedCount) {
        this.cleanedCount = cleanedCount;
    }

    /**
     * The number of active members in the list since the last campaign was sent.
     */
    public Integer getMemberCountSinceSend() {
        return memberCountSinceSend;
    }

    public void setMemberCountSinceSend(Integer memberCountSinceSend) {
        this.memberCountSinceSend = memberCountSinceSend;
    }

    /**
     * The number of members who have unsubscribed since the last campaign was sent.
     */
    public Integer getUnsubscribeCountSinceSend() {
        return unsubscribeCountSinceSend;
    }

    public void setUnsubscribeCountSinceSend(Integer unsubscribeCountSinceSend) {
        this.unsubscribeCountSinceSend = unsubscribeCountSinceSend;
    }

    /**
     * The number of members cleaned from the list since the last campaign was sent.
     */
    public Integer getCleanedCountSinceSend() {
        return cleanedCountSinceSend;
    }

    public void setCleanedCountSinceSend(Integer cleanedCountSinceSend) {
        this.cleanedCountSinceSend = cleanedCountSinceSend;
    }

    /**
     * The number of campaigns in any status that use this list.
     */
    public Integer getCampaignCount() {
        return campaignCount;
    }

    public void setCampaignCount(Integer campaignCount) {
        this.campaignCount = campaignCount;
    }

    /**
     * The date and time the last campaign was sent to this list.
     */
    public String getCampaignLastSent() {
        return campaignLastSent;
    }

    public void setCampaignLastSent(String campaignLastSent) {
        this.campaignLastSent = campaignLastSent;
    }

    /**
     * The number of merge vars for this list (not EMAIL, which is required).
     */
    public Integer getMergeFieldCount() {
        return mergeFieldCount;
    }

    public void setMergeFieldCount(Integer mergeFieldCount) {
        this.mergeFieldCount = mergeFieldCount;
    }

    /**
     * The average number of subscriptions per month for the list (not returned if we haven’t calculated it yet).
     */
    public Double getAvgSubRate() {
        return avgSubRate;
    }

    public void setAvgSubRate(Double avgSubRate) {
        this.avgSubRate = avgSubRate;
    }

    /**
     * The average number of unsubscriptions per month for the list (not returned if we haven’t calculated it yet).
     */
    public Double getAvgUnsubRate() {
        return avgUnsubRate;
    }

    public void setAvgUnsubRate(Double avgUnsubRate) {
        this.avgUnsubRate = avgUnsubRate;
    }

    /**
     * The target number of subscriptions per month for the list to keep it growing (not returned if we haven’t calculated it yet).
     */
    public Double getTargetSubRate() {
        return targetSubRate;
    }

    public void setTargetSubRate(Double targetSubRate) {
        this.targetSubRate = targetSubRate;
    }

    /**
     * The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list
     * (not returned if we haven’t calculated it yet).
     */
    public Double getOpenRate() {
        return openRate;
    }

    public void setOpenRate(Double openRate) {
        this.openRate = openRate;
    }

    /**
     * The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list
     * (not returned if we haven’t calculated it yet).
     */
    public Double getClickRate() {
        return clickRate;
    }

    public void setClickRate(Double clickRate) {
        this.clickRate = clickRate;
    }

    /**
     * The date and time of the last time someone subscribed to this list.
     */
    public String getLastSubDate() {
        return lastSubDate;
    }

    public void setLastSubDate(String lastSubDate) {
        this.lastSubDate = lastSubDate;
    }

    /**
     * The date and time of the last time someone unsubscribed from this list.
     */
    public String getLastUnsubDate() {
        return lastUnsubDate;
    }

    public void setLastUnsubDate(String lastUnsubDate) {
        this.lastUnsubDate = lastUnsubDate;
    }
}
