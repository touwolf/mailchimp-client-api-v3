package com.touwolf.mailchimp.model.camapign.data.folder;

public class CampaignFolderReadRequest
{
    private String fields;

    private String excludeFields;

    private Integer count;

    private Integer offset;

    /**
     * A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     *
     * @return
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
     * @return
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
     * @return
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
     * @return
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
