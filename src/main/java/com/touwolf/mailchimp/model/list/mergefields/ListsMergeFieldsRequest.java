package com.touwolf.mailchimp.model.list.mergefields;

import com.google.gson.annotations.SerializedName;

public class ListsMergeFieldsRequest {
    private String tag;

    private String name;

    private String type;

    private Boolean required;

    @SerializedName("default_value")
    private String defaultValue;

    @SerializedName("public")
    private Boolean isPublic;

    @SerializedName("display_order")
    private Integer displayOrder;

    private ListsMergeFieldsOptions options;

    @SerializedName("help_text")
    private String helpText;

    /**
     * The tag used in MailChimp campaigns and for the /members endpoint.
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * The name of the merge field.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The type for the merge field.
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

    /**
     * The default value for the merge field if null.
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * Whether the merge field is displayed on the signup form.
     */
    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    /**
     * The order that the merge field displays on the list signup form.
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * Extra options for some merge field types.
     */
    public ListsMergeFieldsOptions getOptions() {
        return options;
    }

    public void setOptions(ListsMergeFieldsOptions options) {
        this.options = options;
    }

    /**
     * Extra text to help the subscriber fill out the form.
     */
    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }
}
