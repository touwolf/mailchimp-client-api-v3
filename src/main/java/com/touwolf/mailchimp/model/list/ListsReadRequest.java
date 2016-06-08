package com.touwolf.mailchimp.model.list;

import com.google.gson.annotations.SerializedName;

public class ListsReadRequest {
    private String fields;

    @SerializedName("exclude_fields")
    private String excludeFields;

    private Integer count;

    private Integer offset;

    @SerializedName("before_date_created")
    private String beforeDateCreated;

    @SerializedName("since_date_created")
    private String sinceDateCreated;

    @SerializedName("before_campaign_last_sent")
    private String beforeCampaignLastSent;

    @SerializedName("since_campaign_last_sent")
    private String sinceCampaignLastSent;

    private String email;

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
     * Restrict response to lists created before the set date.
     */
    public String getBeforeDateCreated() {
        return beforeDateCreated;
    }

    public void setBeforeDateCreated(String beforeDateCreated) {
        this.beforeDateCreated = beforeDateCreated;
    }

    /**
     * Restrict results to lists created after the set date.
     */
    public String getSinceDateCreated() {
        return sinceDateCreated;
    }

    public void setSinceDateCreated(String sinceDateCreated) {
        this.sinceDateCreated = sinceDateCreated;
    }

    /**
     * Restrict results to lists created before the last campaign send date.
     */
    public String getBeforeCampaignLastSent() {
        return beforeCampaignLastSent;
    }

    public void setBeforeCampaignLastSent(String beforeCampaignLastSent) {
        this.beforeCampaignLastSent = beforeCampaignLastSent;
    }

    /**
     * Restrict results to lists created after the last campaign send date.
     */
    public String getSinceCampaignLastSent() {
        return sinceCampaignLastSent;
    }

    public void setSinceCampaignLastSent(String sinceCampaignLastSent) {
        this.sinceCampaignLastSent = sinceCampaignLastSent;
    }

    /**
     * Restrict results to lists that include a specific subscriber’s email address.
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
