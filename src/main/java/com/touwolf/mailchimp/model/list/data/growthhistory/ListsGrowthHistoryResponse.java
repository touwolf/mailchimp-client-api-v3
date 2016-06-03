package com.touwolf.mailchimp.model.list.data.growthhistory;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.Links;

import java.util.List;

public class ListsGrowthHistoryResponse
{
    @SerializedName("list_id")
    private String listId;

    private String month;

    private Integer existing;

    private Integer imports;

    private Integer optins;

    @SerializedName("_links")
    private List<Links> links;

    /**
     * The list id for the growth activity report.
     *
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * The month that the growth history is describing.
     *
     */
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * Existing members on the list for a specific month.
     *
     */
    public Integer getExisting() {
        return existing;
    }

    public void setExisting(Integer existing) {
        this.existing = existing;
    }

    /**
     * Imported members on the list for a specific month.
     *
     */
    public Integer getImports() {
        return imports;
    }

    public void setImports(Integer imports) {
        this.imports = imports;
    }

    /**
     * Newly opted-in members on the list for a specific month.
     *
     */
    public Integer getOptins() {
        return optins;
    }

    public void setOptins(Integer optins) {
        this.optins = optins;
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
