package com.touwolf.mailchimp.model.list.members;

import com.google.gson.annotations.SerializedName;

public class ListsMembersRequest {
    @SerializedName("email_type")
    private String emailType;

    private ListsMembersStatusEnum status;

    @SerializedName("merge_fields")
    private String mergeFields;

    private String interests;

    private String language;

    private Boolean vip;

    private ListsMembersLocation location;

    @SerializedName("ip_signup")
    private String ipSignup;

    @SerializedName("timestamp_signup")
    private String timestampSignup;

    @SerializedName("ip_opt")
    private String ipOpt;

    @SerializedName("timestamp_opt")
    private String timestampOpt;

    @SerializedName("email_address")
    private String emailAddress;

    @SerializedName("status_if_new")
    private String statusIfNew;

    /**
     * Type of email this member asked to get (‘html’ or ‘text’).
     */
    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    /**
     * Subscriber’s current status.
     * <p>
     * Possible Values:
     * <p>
     * subscribed
     * unsubscribed
     * cleaned
     * pending
     */
    public ListsMembersStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ListsMembersStatusEnum status) {
        this.status = status;
    }

    /**
     * An individual merge var and value for a member.
     */
    public String getMergeFields() {
        return mergeFields;
    }

    public void setMergeFields(String mergeFields) {
        this.mergeFields = mergeFields;
    }

    /**
     * The key of this object’s properties is the ID of the interest in question.
     */
    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    /**
     * If set/detected, the subscriber’s language.
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * VIP status for subscriber.
     */
    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    /**
     * Subscriber location information.
     */
    public ListsMembersLocation getLocation() {
        return location;
    }

    public void setLocation(ListsMembersLocation location) {
        this.location = location;
    }

    /**
     * IP address the subscriber signed up from.
     */
    public String getIpSignup() {
        return ipSignup;
    }

    public void setIpSignup(String ipSignup) {
        this.ipSignup = ipSignup;
    }

    /**
     * The date and time the subscriber signed up for the list.
     */
    public String getTimestampSignup() {
        return timestampSignup;
    }

    public void setTimestampSignup(String timestampSignup) {
        this.timestampSignup = timestampSignup;
    }

    /**
     * The IP address the subscriber used to confirm their opt-in status.
     */
    public String getIpOpt() {
        return ipOpt;
    }

    public void setIpOpt(String ipOpt) {
        this.ipOpt = ipOpt;
    }

    /**
     * The date and time the subscribe confirmed their opt-in status.
     */
    public String getTimestampOpt() {
        return timestampOpt;
    }

    public void setTimestampOpt(String timestampOpt) {
        this.timestampOpt = timestampOpt;
    }

    /**
     * Email address for a subscriber.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Subscriber’s status. This value is required only if the email address is not already present on the list.
     * Possible Values:
     * <p>
     * subscribed
     * unsubscribed
     * cleaned
     * pending
     */
    public String getStatusIfNew() {
        return statusIfNew;
    }

    public void setStatusIfNew(String statusIfNew) {
        this.statusIfNew = statusIfNew;
    }
}
