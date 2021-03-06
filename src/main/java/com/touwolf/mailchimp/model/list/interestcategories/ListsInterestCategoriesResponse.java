package com.touwolf.mailchimp.model.list.interestcategories;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsInterestCategoriesResponse {
    @SerializedName("list_id")
    private String listId;

    private String id;

    private String title;

    @SerializedName("display_order")
    private Integer displayOrder;

    private ListsInterestCategoriesTypeEnum type;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The unique list id for the category.
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * The id for the interest category.
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * This field appears on signup forms and is often phrased as a question.
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The order that the categories display in the list. Lower numbers display first.
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * Determines how this category’s interests appear on signup forms.
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

    /**
     * A list of link types and descriptions for the API schema documents.
     */
    public List<MailchimpLinks> getLinks() {
        return links;
    }

    public void setLinks(List<MailchimpLinks> links) {
        this.links = links;
    }
}
