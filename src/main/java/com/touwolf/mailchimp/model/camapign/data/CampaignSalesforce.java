package com.touwolf.mailchimp.model.camapign.data;

public class CampaignSalesforce
{
    private Boolean campaign;

    private Boolean notes;

    /**
     * Create a campaign in a connected Salesforce account.
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
