package com.touwolf.mailchimp.model.list.data.members;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.MailchimpLinks;

import java.util.List;
import java.util.Map;

public class ListsMembersResponse
{
    private String id;

    @SerializedName("email_address")
    private String emailAddress;

    @SerializedName("unique_email_id")
    private String uniqueEmailId;

    @SerializedName("email_type")
    private String emailType;

    private String status;

    @SerializedName("merge_fields")
    private Map<String, String> mergeFields;

    private String interests;

    private ListsMembersStats stats;

    @SerializedName("ip_signup")
    private String ipSignup;

    @SerializedName("timestamp_signup")
    private String timestampSignup;

    @SerializedName("ip_opt")
    private String ipOpt;

    @SerializedName("timestamp_opt")
    private String timestampOpt;

    @SerializedName("member_rating")
    private Integer memberRating;

    @SerializedName("last_changed")
    private String lastChanged;

    private String language;

    private Boolean vip;

    @SerializedName("email_client")
    private String emailClient;

    private ListsMembersLocation location;

    @SerializedName("last_note")
    private ListsMembersLastNote lastNote;

    @SerializedName("list_id")
    private String listId;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The MD5 hash of the lowercase version of the list member’s email address
     *
     *
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * An identifier for the address across all of MailChimp.
     *
     */
    public String getUniqueEmailId() {
        return uniqueEmailId;
    }

    public void setUniqueEmailId(String uniqueEmailId) {
        this.uniqueEmailId = uniqueEmailId;
    }

    /**
     * Type of email this member asked to get (‘html’ or ‘text’).
     *
     */
    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    /**
     * Subscriber’s current status.
     * Possible Values:

     * subscribed
     * unsubscribed
     * cleaned
     * pending
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * An individual merge var and value for a member.
     *
     */
    public Map<String, String> getMergeFields() {
        return mergeFields;
    }

    public void setMergeFields(Map<String, String> mergeFields) {
        this.mergeFields = mergeFields;
    }

    /**
     * The key of this object’s properties is the ID of the interest in question.
     *
     */
    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    /**
     * Open and click rates for this subscriber.
     *
     */
    public ListsMembersStats getStats() {
        return stats;
    }

    public void setStats(ListsMembersStats stats) {
        this.stats = stats;
    }

    /**
     * IP address the subscriber signed up from.
     *
     */
    public String getIpSignup() {
        return ipSignup;
    }

    public void setIpSignup(String ipSignup) {
        this.ipSignup = ipSignup;
    }

    /**
     * The date and time the subscriber signed up for the list.
     *
     */
    public String getTimestampSignup() {
        return timestampSignup;
    }

    public void setTimestampSignup(String timestampSignup) {
        this.timestampSignup = timestampSignup;
    }

    /**
     * The IP address the subscriber used to confirm their opt-in status.
     *
     */
    public String getIpOpt() {
        return ipOpt;
    }

    public void setIpOpt(String ipOpt) {
        this.ipOpt = ipOpt;
    }

    /**
     * The date and time the subscribe confirmed their opt-in status.
     *
     */
    public String getTimestampOpt() {
        return timestampOpt;
    }

    public void setTimestampOpt(String timestampOpt) {
        this.timestampOpt = timestampOpt;
    }

    /**
     * Star rating for this member, between 1 and 5.
     *
     */
    public Integer getMemberRating() {
        return memberRating;
    }

    public void setMemberRating(Integer memberRating) {
        this.memberRating = memberRating;
    }

    /**
     * The date and time the member’s info was last changed.
     *
     */
    public String getLastChanged() {
        return lastChanged;
    }

    public void setLastChanged(String lastChanged) {
        this.lastChanged = lastChanged;
    }

    /**
     * If set/detected, the subscriber’s language.
     *
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * VIP status for subscriber.
     *
     */
    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    /**
     * The list member’s email client.
     *
     */
    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    /**
     * Subscriber location information.
     *
     */
    public ListsMembersLocation getLocation() {
        return location;
    }

    public void setLocation(ListsMembersLocation location) {
        this.location = location;
    }

    /**
     * The most recent Note added about this member.
     *
     */
    public ListsMembersLastNote getLastNote() {
        return lastNote;
    }

    public void setLastNote(ListsMembersLastNote lastNote) {
        this.lastNote = lastNote;
    }

    /**
     * The list id.
     *
     */
    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    /**
     * A list of link types and descriptions for the API schema documents.
     *
     */
    public List<MailchimpLinks> getLinks() {
        return links;
    }

    public void setLinks(List<MailchimpLinks> links) {
        this.links = links;
    }
}
