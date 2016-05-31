package com.touwolf.mailchimp.model.global;

public class CampaignHighrise
{
    private Boolean campaign;

    private Boolean notes;

    /**
     * Create a campaign in a connected Highrise account.
     *
     * @return
     */
    public Boolean getCampaign() {
        return campaign;
    }

    public void setCampaign(Boolean campaign) {
        this.campaign = campaign;
    }

    /**
     * Update contact notes for a campaign based on subscriber email addresses.
     *
     * @return
     */
    public Boolean getNotes() {
        return notes;
    }

    public void setNotes(Boolean notes) {
        this.notes = notes;
    }
}
