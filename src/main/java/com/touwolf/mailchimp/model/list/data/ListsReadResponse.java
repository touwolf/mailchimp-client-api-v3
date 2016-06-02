package com.touwolf.mailchimp.model.list.data;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.Links;

import java.util.List;

public class ListsReadResponse
{
    private List<ListsResponse> lists;

    @SerializedName("total_items")
    private Integer totalItems;

    private List<Links> links;

    /**
     * An array of objects, each representing a list.
     *
     */
    public List<ListsResponse> getLists() {
        return lists;
    }

    public void setLists(List<ListsResponse> lists) {
        this.lists = lists;
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
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }
}
