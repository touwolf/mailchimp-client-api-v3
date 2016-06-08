package com.touwolf.mailchimp.model.list.interestcategories;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsInterestCategoriesInterestReadResponse {
    private List<ListsInterestCategoriesInterestResponse> interests;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("category_id")
    private String categoryId;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * An array of this category’s interests
     */
    public List<ListsInterestCategoriesInterestResponse> getInterests() {
        return interests;
    }

    public void setInterests(List<ListsInterestCategoriesInterestResponse> interests) {
        this.interests = interests;
    }

    /**
     * The unique list id that the interests belong to.
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
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * The total number of items matching the query regardless of pagination.
     */
    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
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
