package com.touwolf.mailchimp.model.list.segments;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsSegmentsResponse {
    private Integer id;

    private String name;

    @SerializedName("member_count")
    private Integer memberCount;

    private ListsSegmentsTypeEnum type;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    private ListsSegmentsOptions options;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The unique id for the segment.
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name of the segment.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The number of active subscribers currently included in the segment.
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    /**
     * The type of segment.
     * <p>
     * Possible Values:
     * <p>
     * saved
     * static
     * fuzzy
     */
    public ListsSegmentsTypeEnum getType() {
        return type;
    }

    public void setType(ListsSegmentsTypeEnum type) {
        this.type = type;
    }

    /**
     * The date and time the segment was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The date and time the segment was last updated.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The conditions of the segment. Static and fuzzy segments don’t have conditions.
     */
    public ListsSegmentsOptions getOptions() {
        return options;
    }

    public void setOptions(ListsSegmentsOptions options) {
        this.options = options;
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
     * A list of link types and descriptions for the API schema documents.
     */
    public List<MailchimpLinks> getLinks() {
        return links;
    }

    public void setLinks(List<MailchimpLinks> links) {
        this.links = links;
    }
}
