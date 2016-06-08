package com.touwolf.mailchimp.model.list.webhooks;

public class ListsWebhooksSources {
    private Boolean user;

    private Boolean admin;

    private Boolean api;

    /**
     * Whether the webhook is triggered by subscriber-initiated actions.
     */
    public Boolean getUser() {
        return user;
    }

    public void setUser(Boolean user) {
        this.user = user;
    }

    /**
     * Whether the webhook is triggered by admin-initiated actions in the web interface.
     */
    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * Whether the webhook is triggered by actions initiated via the API.
     */
    public Boolean getApi() {
        return api;
    }

    public void setApi(Boolean api) {
        this.api = api;
    }
}
