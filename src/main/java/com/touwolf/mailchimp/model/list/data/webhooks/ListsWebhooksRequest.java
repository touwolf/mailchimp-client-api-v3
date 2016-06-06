package com.touwolf.mailchimp.model.list.data.webhooks;

public class ListsWebhooksRequest
{
    private String url;

    private ListsWebhooksEvents events;

    private ListsWebhooksSources sources;

    /**
     * A valid URL for the Webhook.
     *
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The events that can trigger the webhook and whether they are enabled.
     *
     */
    public ListsWebhooksEvents getEvents() {
        return events;
    }

    public void setEvents(ListsWebhooksEvents events) {
        this.events = events;
    }

    /**
     * The possible sources of any events that can trigger the webhook and whether they are enabled.
     *
     * @return
     */
    public ListsWebhooksSources getSources() {
        return sources;
    }

    public void setSources(ListsWebhooksSources sources) {
        this.sources = sources;
    }
}
