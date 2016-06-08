package com.touwolf.mailchimp.model.list.interestcategories;

import com.google.gson.annotations.SerializedName;

public class ListsInterestCategoriesRequest {
    private String title;

    @SerializedName("display_order")
    private Integer displayOrder;

    private ListsInterestCategoriesTypeEnum type;

    /**
     * The text description of this category. This field appears on signup forms and is often phrased as a question.
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The order that the categories are displayed in the list. Lower numbers display first.
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * Determines how this category’s interests are displayed on signup forms.
     * <p>
     * Possible Values:
     * <p>
     * checkboxes
     * dropdown
     * radio
     * hidden
     */
    public ListsInterestCategoriesTypeEnum getType() {
        return type;
    }

    public void setType(ListsInterestCategoriesTypeEnum type) {
        this.type = type;
    }
}
