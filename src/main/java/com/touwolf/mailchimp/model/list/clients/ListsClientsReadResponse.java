package com.touwolf.mailchimp.model.list.clients;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsClientsReadResponse {
    private List<ListsClientsResponse> clients;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * An array of top email clients.
     */
    public List<ListsClientsResponse> getClients() {
        return clients;
    }

    public void setClients(List<ListsClientsResponse> clients) {
        this.clients = clients;
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
