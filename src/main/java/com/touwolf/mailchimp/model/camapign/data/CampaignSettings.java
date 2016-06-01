package com.touwolf.mailchimp.model.camapign.data;

import com.google.gson.annotations.SerializedName;

public class CampaignSettings
{
    @SerializedName("subject_line")
    private String subjectLine;

    private String title;

    @SerializedName("from_name")
    private String fromName;

    @SerializedName("reply_to")
    private String replyTo;

    @SerializedName("use_conversation")
    private Boolean useConversation;

    @SerializedName("to_name")
    private String toName;

    @SerializedName("folder_id")
    private String folderId;

    private Boolean authenticate;

    @SerializedName("auto_footer")
    private Boolean autoFooter;

    @SerializedName("inline_css")
    private Boolean inlineCss;

    @SerializedName("auto_tweet")
    private Boolean autoTweet;

    @SerializedName("auto_fb_post")
    private String autoFbPost;

    @SerializedName("fb_comments")
    private Boolean fbComments;

    private Boolean timewarp;

    private Integer templateId;

    private Boolean dragAndDrop;

    /**
     * The subject line for the campaign.
     *
     * @return
     */
    public String getSubjectLine() {
        return subjectLine;
    }

    public void setSubjectLine(String subjectLine) {
        this.subjectLine = subjectLine;
    }

    /**
     * The title of the campaign.
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The ‘from’ name on the campaign (not an email address).
     *
     * @return
     */
    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    /**
     * The reply-to email address for the campaign.
     *
     * @return
     */
    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * Use MailChimp Conversation feature to manage out-of-office replies.
     *
     * @return
     */
    public Boolean getUseConversation() {
        return useConversation;
    }

    public void setUseConversation(Boolean useConversation) {
        this.useConversation = useConversation;
    }

    /**
     * The campaign’s custom ‘To’ name. Typically the first name merge field.
     *
     * @return
     */
    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    /**
     * If the campaign is listed in a folder, the id for that folder.
     *
     * @return
     */
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * Whether MailChimp authenticated the campaign. Defaults to true.
     *
     * @return
     */
    public Boolean getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(Boolean authenticate) {
        this.authenticate = authenticate;
    }

    /**
     * Automatically append MailChimp’s default footer to the campaign.
     *
     * @return
     */
    public Boolean getAutoFooter() {
        return autoFooter;
    }

    public void setAutoFooter(Boolean autoFooter) {
        this.autoFooter = autoFooter;
    }

    /**
     * Automatically inline the CSS included with the campaign content.
     *
     * @return
     */
    public Boolean getInlineCss() {
        return inlineCss;
    }

    public void setInlineCss(Boolean inlineCss) {
        this.inlineCss = inlineCss;
    }

    /**
     * Automatically tweet a link to the campaign archive page when the campaign is sent.
     *
     * @return
     */
    public Boolean getAutoTweet() {
        return autoTweet;
    }

    public void setAutoTweet(Boolean autoTweet) {
        this.autoTweet = autoTweet;
    }

    /**
     * An array of Facebook page ids to auto-post to.
     *
     * @return
     */
    public String getAutoFbPost() {
        return autoFbPost;
    }

    public void setAutoFbPost(String autoFbPost) {
        this.autoFbPost = autoFbPost;
    }

    /**
     * Allows Facebook comments on the campaign (also force-enables the Campaign Archive toolbar). Defaults to true.
     *
     * @return
     */
    public Boolean getFbComments() {
        return fbComments;
    }

    public void setFbComments(Boolean fbComments) {
        this.fbComments = fbComments;
    }

    /**
     * Send this campaign using Timewarp.
     *
     * @return
     */
    public Boolean getTimewarp() {
        return timewarp;
    }

    public void setTimewarp(Boolean timewarp) {
        this.timewarp = timewarp;
    }

    /**
     * The id for the template used in this campaign.
     *
     * @return
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * Whether the campaign uses the drag-and-drop editor.
     *
     * @return
     */
    public Boolean getDragAndDrop() {
        return dragAndDrop;
    }

    public void setDragAndDrop(Boolean dragAndDrop) {
        this.dragAndDrop = dragAndDrop;
    }
}
