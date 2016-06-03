package com.touwolf.mailchimp.model.campaign.data.checklist;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.MailchimpLinks;

import java.util.List;

public class CampaignChecklistResponse
{
    @SerializedName("is_ready")
    private Boolean isReady;

    private List<CampaignChecklistItem> items;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * Whether the campaign is ready to send.
     *
     */
    public Boolean getReady() {
        return isReady;
    }

    public void setReady(Boolean ready) {
        isReady = ready;
    }

    /**
     * A list of feedback items to review before sending your campaign.
     *
     */
    public List<CampaignChecklistItem> getItems() {
        return items;
    }

    public void setItems(List<CampaignChecklistItem> items) {
        this.items = items;
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
