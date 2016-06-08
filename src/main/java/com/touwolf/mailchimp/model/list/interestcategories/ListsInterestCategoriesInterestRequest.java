package com.touwolf.mailchimp.model.list.interestcategories;

import com.google.gson.annotations.SerializedName;

public class ListsInterestCategoriesInterestRequest {
    @SerializedName("list_id")
    private String listId;

    private String name;

    @SerializedName("subscriber_count")
    private String subscriberCount;

    @SerializedName("display_order")
    private Integer displayOrder;

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
}
