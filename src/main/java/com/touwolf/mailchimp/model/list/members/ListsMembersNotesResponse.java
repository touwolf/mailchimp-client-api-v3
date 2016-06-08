package com.touwolf.mailchimp.model.list.members;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsMembersNotesResponse {
    private Integer id;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("created_by")
    private String createdBy;

    @SerializedName("updated_at")
    private String updatedAt;

    private String note;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("email_id")
    private String emailId;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The note id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The date and time the note was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The author of the note.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * The date and time the note was last updated.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The content of the note.
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<MailchimpLinks> getLinks() {
        return links;
    }

    public void setLinks(List<MailchimpLinks> links) {
        this.links = links;
    }
}
