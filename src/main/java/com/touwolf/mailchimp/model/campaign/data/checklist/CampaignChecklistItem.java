package com.touwolf.mailchimp.model.campaign.data.checklist;

public class CampaignChecklistItem
{
    private String type;

    private String heading;

    private String details;

    /**
     * The item type
     * Possible Values:
     * success
     * warning
     * error
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * The heading for the specific item.
     *
     */
    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Details about the specific feedback item.
     *
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
