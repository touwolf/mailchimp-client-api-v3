package com.touwolf.mailchimp.model.list.clients;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsClientsResponse {
    private String client;

    private Integer members;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The name of the email client.
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    /**
     * The number of subscribed members who used this email client.
     */
    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    /**
     * The unique id for the list.
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
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
