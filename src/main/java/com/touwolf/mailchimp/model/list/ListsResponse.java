package com.touwolf.mailchimp.model.list;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.data.MailchimpLinks;

import java.util.List;

public class ListsResponse {
    private String id;

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

    @SerializedName("date_created")
    private String dateCreated;

    @SerializedName("list_rating")
    private Integer listRating;

    @SerializedName("email_type_option")
    private Boolean emailTypeOption;

    @SerializedName("subscribe_url_short")
    private String subscribeUrlShort;

    @SerializedName("subscribe_url_long")
    private String subscribeUrlLong;

    @SerializedName("beamer_address")
    private String beamerAddress;

    private ListsVisibleEnum visibility;

    private String[] modules;

    private ListsStats stats;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * A string that uniquely identifies this list.
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the list.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Contact information displayed in campaign footers to comply with international spam laws.
     */
    public ListsContact getContact() {
        return contact;
    }

    public void setContact(ListsContact contact) {
        this.contact = contact;
    }

    /**
     * The permission reminder for the list.
     */
    public String getPermissionReminder() {
        return permissionReminder;
    }

    public void setPermissionReminder(String permissionReminder) {
        this.permissionReminder = permissionReminder;
    }

    /**
     * Whether campaigns for this list use the Archive Bar in archives by default.
     */
    public Boolean getUseArchiveBar() {
        return useArchiveBar;
    }

    public void setUseArchiveBar(Boolean useArchiveBar) {
        this.useArchiveBar = useArchiveBar;
    }

    /**
     * Default values for campaigns created for this list.
     */
    public ListsCampaignDefault getCampaignDefault() {
        return campaignDefault;
    }

    public void setCampaignDefault(ListsCampaignDefault campaignDefault) {
        this.campaignDefault = campaignDefault;
    }

    /**
     * The email address to send subscribe notifications to.
     */
    public String getNotifyOnSubscribe() {
        return notifyOnSubscribe;
    }

    public void setNotifyOnSubscribe(String notifyOnSubscribe) {
        this.notifyOnSubscribe = notifyOnSubscribe;
    }

    /**
     * The email address to send unsubscribe notifications to.
     */
    public String getNotifyOnUnsubscribe() {
        return notifyOnUnsubscribe;
    }

    public void setNotifyOnUnsubscribe(String notifyOnUnsubscribe) {
        this.notifyOnUnsubscribe = notifyOnUnsubscribe;
    }

    /**
     * The date and time that this list was created.
     */
    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * An auto-generated activity score for the list (0-5).
     */
    public Integer getListRating() {
        return listRating;
    }

    public void setListRating(Integer listRating) {
        this.listRating = listRating;
    }

    /**
     * Whether the list supports multiple formats for emails. When set to true, subscribers can choose whether they want
     * to receive HTML or plain-text emails. When set to false, subscribers will receive HTML emails, with a plain-text alternative backup.
     */
    public Boolean getEmailTypeOption() {
        return emailTypeOption;
    }

    public void setEmailTypeOption(Boolean emailTypeOption) {
        this.emailTypeOption = emailTypeOption;
    }

    /**
     * Our EepURL shortened version of this list’s subscribe form.
     */
    public String getSubscribeUrlShort() {
        return subscribeUrlShort;
    }

    public void setSubscribeUrlShort(String subscribeUrlShort) {
        this.subscribeUrlShort = subscribeUrlShort;
    }

    /**
     * The full version of this list’s subscribe form (host will vary).
     */
    public String getSubscribeUrlLong() {
        return subscribeUrlLong;
    }

    public void setSubscribeUrlLong(String subscribeUrlLong) {
        this.subscribeUrlLong = subscribeUrlLong;
    }

    /**
     * The list’s Email Beamer address.
     */
    public String getBeamerAddress() {
        return beamerAddress;
    }

    public void setBeamerAddress(String beamerAddress) {
        this.beamerAddress = beamerAddress;
    }

    /**
     * Whether this list is public or private.
     * <p>
     * Possible Values:
     * <p>
     * pub
     * prv
     */
    public ListsVisibleEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(ListsVisibleEnum visibility) {
        this.visibility = visibility;
    }

    /**
     * Any list-specific modules installed for this list.
     */
    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    /**
     * Stats for the list. Many of these are cached for at least five minutes.
     */
    public ListsStats getStats() {
        return stats;
    }

    public void setStats(ListsStats stats) {
        this.stats = stats;
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
