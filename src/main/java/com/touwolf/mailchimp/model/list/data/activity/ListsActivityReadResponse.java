package com.touwolf.mailchimp.model.list.data.activity;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.MailchimpLinks;

import java.util.List;

public class ListsActivityReadResponse
{
    private List<ListsActivityRespose> activity;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * Recent list activity.
     *
     */
    public List<ListsActivityRespose> getActivity() {
        return activity;
    }

    public void setActivity(List<ListsActivityRespose> activity) {
        this.activity = activity;
    }

    /**
     * The unique id for the list.
     *
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
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
