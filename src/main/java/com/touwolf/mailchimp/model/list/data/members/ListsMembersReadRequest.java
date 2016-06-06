package com.touwolf.mailchimp.model.list.data.members;

import com.google.gson.annotations.SerializedName;

public class ListsMembersReadRequest
{
    private String fields;

    @SerializedName("exclude_fields")
    private String excludeFields;

    private Integer count;

    private Integer offset;

    @SerializedName("email_type")
    private String emailType;

    private String status;

    @SerializedName("since_timestamp_opt")
    private String sinceTimestampOpt;

    @SerializedName("before_timestamp_opt")
    private String beforeTimestampOpt;

    @SerializedName("since_last_changed")
    private String sinceLastChanged;

    @SerializedName("before_last_changed")
    private String beforeLastChanged;

    @SerializedName("unique_email_id")
    private String uniqueEmailId;

    @SerializedName("vip_only")
    private Boolean vipOnly;

    /**
     * A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     *
     */
    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     */
    public String getExcludeFields() {
        return excludeFields;
    }

    public void setExcludeFields(String excludeFields) {
        this.excludeFields = excludeFields;
    }

    /**
     * The number of records to return.
     *
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * The number of records from a collection to skip. Iterating over large collections with this parameter can be slow.
     *
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * The email type.
     *
     */
    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    /**
     * The subscriber’s status.
     *
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Restrict results to subscribers who opted-in after the set timeframe.
     *
     */
    public String getSinceTimestampOpt() {
        return sinceTimestampOpt;
    }

    public void setSinceTimestampOpt(String sinceTimestampOpt) {
        this.sinceTimestampOpt = sinceTimestampOpt;
    }

    /**
     * Restrict results to subscribers who opted-in before the set timeframe.
     *
     */
    public String getBeforeTimestampOpt() {
        return beforeTimestampOpt;
    }

    public void setBeforeTimestampOpt(String beforeTimestampOpt) {
        this.beforeTimestampOpt = beforeTimestampOpt;
    }

    /**
     * Restrict results to subscribers whose information changed after the set timeframe.
     *
     */
    public String getSinceLastChanged() {
        return sinceLastChanged;
    }

    public void setSinceLastChanged(String sinceLastChanged) {
        this.sinceLastChanged = sinceLastChanged;
    }

    /**
     * Restrict results to subscribers whose information changed before the set timeframe.
     *
     */
    public String getBeforeLastChanged() {
        return beforeLastChanged;
    }

    public void setBeforeLastChanged(String beforeLastChanged) {
        this.beforeLastChanged = beforeLastChanged;
    }

    /**
     * A unique identifier for the email address across all MailChimp lists.
     * This parameter can be found in any links with Ecommerce Tracking enabled.
     *
     */
    public String getUniqueEmailId() {
        return uniqueEmailId;
    }

    public void setUniqueEmailId(String uniqueEmailId) {
        this.uniqueEmailId = uniqueEmailId;
    }

    /**
     * A filter to return only the list’s VIP members. Passing true will restrict results to VIP list members,
     * passing false will return all list members.
     *
     */
    public Boolean getVipOnly() {
        return vipOnly;
    }

    public void setVipOnly(Boolean vipOnly) {
        this.vipOnly = vipOnly;
    }
}
