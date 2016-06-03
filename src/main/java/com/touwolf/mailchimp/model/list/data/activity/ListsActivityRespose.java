package com.touwolf.mailchimp.model.list.data.activity;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.MailchimpLinks;

import java.util.List;

public class ListsActivityRespose
{
    private String day;

    @SerializedName("emails_sent")
    private Integer emailsSent;

    @SerializedName("unique_opens")
    private Integer uniqueOpens;

    @SerializedName("recipient_clicks")
    private Integer recipientClicks;

    @SerializedName("hard_bounce")
    private Integer hardBounce;

    @SerializedName("soft_bounce")
    private Integer softBounce;

    private Integer subs;

    private Integer unsubs;

    @SerializedName("other_adds")
    private Integer otherAdds;

    @SerializedName("other_removes")
    private Integer otherRemoves;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * The date for the activity summary.
     *
     */
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    /**
     * The total number of emails sent on the date for the activity summary.
     *
     */
    public Integer getEmailsSent() {
        return emailsSent;
    }

    public void setEmailsSent(Integer emailsSent) {
        this.emailsSent = emailsSent;
    }

    /**
     * The number of unique opens.
     *
     */
    public Integer getUniqueOpens() {
        return uniqueOpens;
    }

    public void setUniqueOpens(Integer uniqueOpens) {
        this.uniqueOpens = uniqueOpens;
    }

    /**
     * The number of clicks.
     *
     */
    public Integer getRecipientClicks() {
        return recipientClicks;
    }

    public void setRecipientClicks(Integer recipientClicks) {
        this.recipientClicks = recipientClicks;
    }

    /**
     * The number of hard bounces.
     *
     */
    public Integer getHardBounce() {
        return hardBounce;
    }

    public void setHardBounce(Integer hardBounce) {
        this.hardBounce = hardBounce;
    }

    /**
     * The number of soft bounces
     *
     */
    public Integer getSoftBounce() {
        return softBounce;
    }

    public void setSoftBounce(Integer softBounce) {
        this.softBounce = softBounce;
    }

    /**
     * The number of subscribes.
     *
     */
    public Integer getSubs() {
        return subs;
    }

    public void setSubs(Integer subs) {
        this.subs = subs;
    }

    /**
     * The number of unsubscribes.
     *
     */
    public Integer getUnsubs() {
        return unsubs;
    }

    public void setUnsubs(Integer unsubs) {
        this.unsubs = unsubs;
    }

    /**
     * The number of subscribers who may have been added outside of the double opt-in process, such as imports or API activity.
     *
     */
    public Integer getOtherAdds() {
        return otherAdds;
    }

    public void setOtherAdds(Integer otherAdds) {
        this.otherAdds = otherAdds;
    }

    /**
     * The number of subscribers who may have been removed outside of unsubscribing or reporting an email as spam (for example, deleted subscribers).
     *
     */
    public Integer getOtherRemoves() {
        return otherRemoves;
    }

    public void setOtherRemoves(Integer otherRemoves) {
        this.otherRemoves = otherRemoves;
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
