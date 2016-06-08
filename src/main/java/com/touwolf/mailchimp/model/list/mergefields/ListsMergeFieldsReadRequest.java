package com.touwolf.mailchimp.model.list.mergefields;

import com.google.gson.annotations.SerializedName;

public class ListsMergeFieldsReadRequest {
    private String fields;

    @SerializedName("exclude_fields")
    private String excludeFields;

    private Integer count;

    private Integer offset;

    private String type;

    private Boolean required;

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
     * The merge field type.
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The boolean value if the merge field is required.
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
