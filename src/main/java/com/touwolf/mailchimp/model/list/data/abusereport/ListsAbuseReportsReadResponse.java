package com.touwolf.mailchimp.model.list.data.abusereport;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.Links;

import java.util.List;

public class ListsAbuseReportsReadResponse
{
    @SerializedName("abuse_report")
    private ListsAbuseReportsResponse abuseReports;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<Links> links;

    /**
     * An array of objects, each representing an abuse report resource.
     *
     */
    public ListsAbuseReportsResponse getAbuseReports() {
        return abuseReports;
    }

    public void setAbuseReports(ListsAbuseReportsResponse abuseReports) {
        this.abuseReports = abuseReports;
    }

    /**
     * The list id for the abuse report.
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