package com.touwolf.mailchimp.model.list.data;

import com.google.gson.annotations.SerializedName;

public class ListsRequest
{
    private String name;

    private ListsContact contact;

    @SerializedName("permission_reminder")
    private String permissionReminder;

    @SerializedName("use_archive_bar")
    private Boolean useArchiveBar;

    @SerializedName("campaign_defaults")
    private ListsCampaignDefault campaignDefault;

    @SerializedName("notify_on_subscribe")
    private String notifyOnSubscribe;

    @SerializedName("notify_on_unsubscribe")
    private String notifyOnUnsubscribe;

    @SerializedName("email_type_option")
    private Boolean emailTypeOption;

    private String visibility;

    /**
     * The name of the list.
     *
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Contact information displayed in campaign footers to comply with international spam laws.
     *
     */
    public ListsContact getContact() {
        return contact;
    }

    public void setContact(ListsContact contact) {
        this.contact = contact;
    }

    /**
     * The permission reminder for the list.
     *
     */
    public String getPermissionReminder() {
        return permissionReminder;
    }

    public void setPermissionReminder(String permissionReminder) {
        this.permissionReminder = permissionReminder;
    }

    /**
     * Whether campaigns for this list use the Archive Bar in archives by default.
     *
     */
    public Boolean getUseArchiveBar() {
        return useArchiveBar;
    }

    public void setUseArchiveBar(Boolean useArchiveBar) {
        this.useArchiveBar = useArchiveBar;
    }

    /**
     * Default values for campaigns created for this list.
     *
     */
    public ListsCampaignDefault getCampaignDefault() {
        return campaignDefault;
    }

    public void setCampaignDefault(ListsCampaignDefault campaignDefault) {
        this.campaignDefault = campaignDefault;
    }

    /**
     * The email address to send subscribe notifications to.
     *
     */
    public String getNotifyOnSubscribe() {
        return notifyOnSubscribe;
    }

    public void setNotifyOnSubscribe(String notifyOnSubscribe) {
        this.notifyOnSubscribe = notifyOnSubscribe;
    }

    /**
     * The email address to send unsubscribe notifications to.
     *
     */
    public String getNotifyOnUnsubscribe() {
        return notifyOnUnsubscribe;
    }

    public void setNotifyOnUnsubscribe(String notifyOnUnsubscribe) {
        this.notifyOnUnsubscribe = notifyOnUnsubscribe;
    }

    /**
     * Whether the list supports multiple formats for emails. When set to true, subscribers can choose whether they
     * want to receive HTML or plain-text emails. When set to false, subscribers will receive HTML emails,
     * with a plain-text alternative backup.
     *
     */
    public Boolean getEmailTypeOption() {
        return emailTypeOption;
    }

    public void setEmailTypeOption(Boolean emailTypeOption) {
        this.emailTypeOption = emailTypeOption;
    }

    /**
     * Whether this list is public or private.
     * Possible Values:
     * pub
     * prv
     *
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
