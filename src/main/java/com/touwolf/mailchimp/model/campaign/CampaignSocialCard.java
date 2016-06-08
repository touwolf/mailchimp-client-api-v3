package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

class CampaignSocialCard {
    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("description")
    private String description;

    @SerializedName("title")
    private String title;

    /**
     * The url for the header image for the card.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * A short summary of the campaign to display.
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The title for the card. Typically the subject line of the campaign.
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
