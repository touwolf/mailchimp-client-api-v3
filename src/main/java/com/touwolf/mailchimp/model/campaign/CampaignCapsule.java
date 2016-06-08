package com.touwolf.mailchimp.model.campaign;

class CampaignCapsule {
    private Boolean notes;

    /**
     * Update contact notes for a campaign based on subscriber email addresses.
     */
    public Boolean getNotes() {
        return notes;
    }

    public void setNotes(Boolean notes) {
        this.notes = notes;
    }
}
