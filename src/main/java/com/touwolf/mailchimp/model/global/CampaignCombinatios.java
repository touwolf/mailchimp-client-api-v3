package com.touwolf.mailchimp.model.global;

import com.google.gson.annotations.SerializedName;

public class CampaignCombinatios
{
    private String id;

    @SerializedName("subject_line")
    private Integer subjectLine;

    @SerializedName("send_time")
    private Integer sendTime;

    @SerializedName("from_name")
    private Integer fromName;

    @SerializedName("reply_to")
    private Integer replyTo;

    @SerializedName("content_description")
    private Integer contentDescription;

    private Integer recipients;

    /**
     * Unique ID for the combination.
     *
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The index of variate_settings.subject_lines used.
     *
     * @return
     */
    public Integer getSubjectLine() {
        return subjectLine;
    }

    public void setSubjectLine(Integer subjectLine) {
        this.subjectLine = subjectLine;
    }

    /**
     * The index of variate_settings.send_times used.
     *
     * @return
     */
    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * The index of variate_settings.from_names used.
     *
     * @return
     */
    public Integer getFromName() {
        return fromName;
    }

    public void setFromName(Integer fromName) {
        this.fromName = fromName;
    }

    /**
     * The index of variate_settings.reply_to_addresses used.
     *
     * @return
     */
    public Integer getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(Integer replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * The index of variate_settings.contents used.
     * @return
     */
    public Integer getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(Integer contentDescription) {
        this.contentDescription = contentDescription;
    }

    /**
     * The number of recipients for this combination.
     *
     * @return
     */
    public Integer getRecipients() {
        return recipients;
    }

    public void setRecipients(Integer recipients) {
        this.recipients = recipients;
    }
}
