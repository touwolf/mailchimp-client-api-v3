package com.touwolf.mailchimp.model.list.data.growthhistory;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.Links;

import java.util.List;

public class ListsGrowthHistoryReadResponse
{
    private List<ListsGrowthHistoryResponse> history;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<Links> links;

    /**
     * An array of objects, each representing a monthly growth report for a list.
     *
     */
    public List<ListsGrowthHistoryResponse> getHistory() {
        return history;
    }

    public void setHistory(List<ListsGrowthHistoryResponse> history) {
        this.history = history;
    }

    /**
     * The list id.
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
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }
}