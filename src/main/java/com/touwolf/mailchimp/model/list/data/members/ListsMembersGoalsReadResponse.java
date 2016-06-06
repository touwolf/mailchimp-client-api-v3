package com.touwolf.mailchimp.model.list.data.members;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.MailchimpLinks;

import java.util.List;

public class ListsMembersGoalsReadResponse
{
    private List<ListsMembersGoalsResponse> goals;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("email_id")
    private String emailId;

    @SerializedName("total_items")
    private Integer totalItems;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The last 50 Goal events triggered by a member.
     *
     */
    public List<ListsMembersGoalsResponse> getGoals() {
        return goals;
    }

    public void setGoals(List<ListsMembersGoalsResponse> goals) {
        this.goals = goals;
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
     * The MD5 hash of the lowercase version of the list member’s email address.
     *
     */
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
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
