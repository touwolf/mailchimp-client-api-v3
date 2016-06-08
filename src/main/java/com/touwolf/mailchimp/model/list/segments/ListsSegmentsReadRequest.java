package com.touwolf.mailchimp.model.list.segments;

import com.google.gson.annotations.SerializedName;

public class ListsSegmentsReadRequest {
    private String fields;

    @SerializedName("exclude_fields")
    private String excludeFields;

    private Integer count;

    private Integer offset;

    private String type;

    @SerializedName("since_created_at")
    private String sinceCreatedAt;

    @SerializedName("before_created_at")
    private String beforeCreatedAt;

    @SerializedName("since_updated_at")
    private String sinceUpdatedAt;

    @SerializedName("before_updated_at")
    private String beforeUpdatedAt;

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
     * A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notatio
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
     * Limit results based on segment type.
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Restrict results to segments created after the set time.
     */
    public String getSinceCreatedAt() {
        return sinceCreatedAt;
    }

    public void setSinceCreatedAt(String sinceCreatedAt) {
        this.sinceCreatedAt = sinceCreatedAt;
    }

    /**
     * Restrict results to segments created before the set time.
     */
    public String getBeforeCreatedAt() {
        return beforeCreatedAt;
    }

    public void setBeforeCreatedAt(String beforeCreatedAt) {
        this.beforeCreatedAt = beforeCreatedAt;
    }

    /**
     * Restrict results to segments update after the set time.
     */
    public String getSinceUpdatedAt() {
        return sinceUpdatedAt;
    }

    public void setSinceUpdatedAt(String sinceUpdatedAt) {
        this.sinceUpdatedAt = sinceUpdatedAt;
    }

    /**
     * Restrict results to segments update before the set time.
     */
    public String getBeforeUpdatedAt() {
        return beforeUpdatedAt;
    }

    public void setBeforeUpdatedAt(String beforeUpdatedAt) {
        this.beforeUpdatedAt = beforeUpdatedAt;
    }
}
