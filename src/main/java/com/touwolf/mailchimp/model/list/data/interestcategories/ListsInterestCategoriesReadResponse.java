package com.touwolf.mailchimp.model.list.data.interestcategories;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.MailchimpLinks;

import java.util.List;

public class ListsInterestCategoriesReadResponse
{
    @SerializedName("list_id")
    private String listId;

    private ListsInterestCategoriesResponse categories;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The ID for the list that this category belongs to.
     *
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * This array contains individual interest categories.
     *
     */
    public ListsInterestCategoriesResponse getCategories() {
        return categories;
    }

    public void setCategories(ListsInterestCategoriesResponse categories) {
        this.categories = categories;
    }

    /**
     * The total number of items matching the query regardless of pagination.
     *
     */
    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    /**
     * A list of link types and descriptions for the API schema documents.
     *
     */
    public List<MailchimpLinks> getLinks() {
        return links;
    }

    public void setLinks(List<MailchimpLinks> links) {
        this.links = links;
    }
}
