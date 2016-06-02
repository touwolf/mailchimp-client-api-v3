package com.touwolf.mailchimp.model.list.data.abusereport;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.Links;

import java.util.List;

public class ListsAbuseReportsResponse
{
    private Integer id;

    @SerializedName("campaign_id")
    private String campaignId;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("email_id")
    private String emailId;

    @SerializedName("email_address")
    private String emailAddress;

    private String date;

    @SerializedName("_links")
    private List<Links> links;

    /**
     * The id for the abuse report
     *
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The campaign id for the abuse report
     *
     */
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
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
     * Email address for a subscriber.
     *
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Date for the abuse report
     *
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
