package com.touwolf.mailchimp.model.list.webhooks;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsWebhooksResponse {
    private String id;

    private String url;

    private ListsWebhooksEvents events;

    private ListsWebhooksSources sources;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * An string that uniquely identifies this webhook.
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A valid URL for the Webhook
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The events that can trigger the webhook and whether they are enabled.
     */
    public ListsWebhooksEvents getEvents() {
        return events;
    }

    public void setEvents(ListsWebhooksEvents events) {
        this.events = events;
    }

    /**
     * The possible sources of any events that can trigger the webhook and whether they are enabled.
     */
    public ListsWebhooksSources getSources() {
        return sources;
    }

    public void setSources(ListsWebhooksSources sources) {
        this.sources = sources;
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
