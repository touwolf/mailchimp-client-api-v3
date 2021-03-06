package com.touwolf.mailchimp.model.list.interestcategories;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsInterestCategoriesInterestResponse {
    @SerializedName("category_id")
    private String categoryId;

    @SerializedName("list_id")
    private String listId;

    private String id;

    private String name;

    @SerializedName("subscriber_count")
    private String subscriberCount;

    @SerializedName("displayOrder")
    private Integer displayOrder;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

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
     * The ID for the list that this interest belongs to.
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * The ID for the interest.
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the interest. This can be shown publicly on a subscription form.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The number of subscribers associated with this interest.
     */
    public String getSubscriberCount() {
        return subscriberCount;
    }

    public void setSubscriberCount(String subscriberCount) {
        this.subscriberCount = subscriberCount;
    }

    /**
     * The display order for interests.
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
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
