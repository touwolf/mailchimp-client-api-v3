package com.touwolf.mailchimp.model.list.segments;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsSegmentsReadResponse {
    private List<ListsSegmentsResponse> segments;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * An array of objects, each representing a list segment.
     */
    public List<ListsSegmentsResponse> getSegments() {
        return segments;
    }

    public void setSegments(List<ListsSegmentsResponse> segments) {
        this.segments = segments;
    }

    /**
     * The list id.
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
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
