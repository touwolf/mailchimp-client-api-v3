package com.touwolf.mailchimp.model.campaign.checklist;

public class CampaignChecklistItem {
    private CampaignChecklistItemTypeEnum type;

    private String heading;

    private String details;

    /**
     * The item type
     * <p>
     * Possible Values:
     * <p>
     * success
     * warning
     * error
     */
    public CampaignChecklistItemTypeEnum getType() {
        return type;
    }

    public void setType(CampaignChecklistItemTypeEnum type) {
        this.type = type;
    }

    /**
     * The heading for the specific item.
     */
    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    /**
     * Details about the specific feedback item.
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
