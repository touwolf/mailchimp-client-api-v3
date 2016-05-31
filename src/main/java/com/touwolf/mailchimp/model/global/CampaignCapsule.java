package com.touwolf.mailchimp.model.global;

public class CampaignCapsule
{
    private Boolean notes;

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
