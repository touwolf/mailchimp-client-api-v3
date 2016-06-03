package com.touwolf.mailchimp.model.list.data.interestcategories;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.Links;

import java.util.List;

public class ListsInterestCategoriesInterestResponse
{
    @SerializedName("category_id")
    private String categoryId;

    @SerializedName("list_id")
    private String listId;

    private String id;

    private String name;

    @SerializedName("subscriber_count")
    private String subscriberCount;

    @SerializedName("displayOrder")
    private Integer display_order;

    @SerializedName("_links")
    private List<Links> links;

    /**
     * The id for the interest category.
     *
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * The ID for the list that this interest belongs to.
     *
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * The ID for the interest.
     *
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the interest. This can be shown publicly on a subscription form.
     *
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The number of subscribers associated with this interest.
     *
     */
    public String getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(String subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    /**
     * The display order for interests.
     *
     */
    public Integer getDisplay_order() {
        return display_order;
    }

    public void setDisplay_order(Integer display_order) {
        this.display_order = display_order;
    }

    /**
     * A list of link types and descriptions for the API schema documents.
     *
     */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }
}
