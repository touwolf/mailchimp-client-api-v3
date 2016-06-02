package com.touwolf.mailchimp.model.list.data;

public class ListsCampaignDefault
{
    private String fromName;

    private String fromEmail;

    private String subject;

    private String language;

    /**
     * The default from name for campaigns sent to this list.
     *
     */
    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    /**
     * The default from email for campaigns sent to this list.
     *
     */
    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    /**
     * The default subject line for campaigns sent to this list.
     *
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * The default language for this lists’s forms.
     *
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
