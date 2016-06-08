package com.touwolf.mailchimp.model.list.webhooks;

public class ListsWebhooksEvents {
    private Boolean subscribe;

    private Boolean unsubscribe;

    private Boolean profile;

    private Boolean cleaned;

    private Boolean upemail;

    private Boolean campaign;

    /**
     * Whether the webhook is triggered when a list subscriber is added.
     */
    public Boolean getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * Whether the webhook is triggered when a list member unsubscribes.
     */
    public Boolean getUnsubscribe() {
        return unsubscribe;
    }

    public void setUnsubscribe(Boolean unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    /**
     * Whether the webhook is triggered when a subscriber’s profile is updated.
     */
    public Boolean getProfile() {
        return profile;
    }

    public void setProfile(Boolean profile) {
        this.profile = profile;
    }

    /**
     * Whether the webhook is triggered when a subscriber’s email address is cleaned from the list.
     */
    public Boolean getCleaned() {
        return cleaned;
    }

    public void setCleaned(Boolean cleaned) {
        this.cleaned = cleaned;
    }

    /**
     * Whether the webhook is triggered when a subscriber’s email address is changed.
     */
    public Boolean getUpemail() {
        return upemail;
    }

    public void setUpemail(Boolean upemail) {
        this.upemail = upemail;
    }

    /**
     * Whether the webhook is triggered when a campaign is sent or cancelled.
     */
    public Boolean getCampaign() {
        return campaign;
    }

    public void setCampaign(Boolean campaign) {
        this.campaign = campaign;
    }
}
