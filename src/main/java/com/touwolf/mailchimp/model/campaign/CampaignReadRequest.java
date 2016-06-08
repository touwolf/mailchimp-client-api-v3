package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

public class CampaignReadRequest {
    private String fields;

    @SerializedName("exclude_fields")
    private String excludeFields;

    private Integer count;

    private Integer offset;

    private CampaignTypeEnum type;

    private CampaignStatusEnum status;

    @SerializedName("before_send_time")
    private String beforeSendTime;

    @SerializedName("since_send_time")
    private String sinceSendTime;

    @SerializedName("before_create_time")
    private String beforeCreateTime;

    @SerializedName("since_create_time")
    private String sinceCreateTime;

    @SerializedName("list_id")
    private String listId;

    /**
     * A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     */
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     */
    public String getExcludeFields() {
        return excludeFields;
    }

    public void setExcludeFields(String excludeFields) {
        this.excludeFields = excludeFields;
    }

    /**
     * The number of records to return.
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * The number of records from a collection to skip. Iterating over large collections with this parameter can be slow.
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * The campaign type.
     * <p>
     * Possible Values:
     * <p>
     * regular
     * plaintext
     * absplit
     * rss
     * variate
     */
    public CampaignTypeEnum getType() {
        return type;
    }

    public void setType(CampaignTypeEnum type) {
        this.type = type;
    }

    /**
     * The status of the campaign.
     * <p>
     * Possible Values:
     * <p>
     * save
     * paused
     * schedule
     * sending
     * sent
     */
    public CampaignStatusEnum getStatus() {
        return status;
    }

    public void setStatus(CampaignStatusEnum status) {
        this.status = status;
    }

    /**
     * Restrict the response to campaigns sent before the set time. We recommend ISO 8601 time format: 2015-10-21T15:41:36+00:00.
     */
    public String getBeforeSendTime() {
        return beforeSendTime;
    }

    public void setBeforeSendTime(String beforeSendTime) {
        this.beforeSendTime = beforeSendTime;
    }

    /**
     * Restrict the response to campaigns sent after the set time. We recommend ISO 8601 time format: 2015-10-21T15:41:36+00:00.
     */
    public String getSinceSendTime() {
        return sinceSendTime;
    }

    public void setSinceSendTime(String sinceSendTime) {
        this.sinceSendTime = sinceSendTime;
    }

    /**
     * Restrict the response to campaigns created before the set time. We recommend ISO 8601 time format: 2015-10-21T15:41:36+00:00.
     */
    public String getBeforeCreateTime() {
        return beforeCreateTime;
    }

    public void setBeforeCreateTime(String beforeCreateTime) {
        this.beforeCreateTime = beforeCreateTime;
    }

    /**
     * Restrict the response to campaigns created after the set time. We recommend ISO 8601 time format: 2015-10-21T15:41:36+00:00.
     */
    public String getSinceCreateTime() {
        return sinceCreateTime;
    }

    public void setSinceCreateTime(String sinceCreateTime) {
        this.sinceCreateTime = sinceCreateTime;
    }

    /**
     * The unique id for the list.
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }
}
