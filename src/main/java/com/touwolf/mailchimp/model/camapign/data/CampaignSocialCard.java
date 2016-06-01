package com.touwolf.mailchimp.model.camapign.data;

import com.google.gson.annotations.SerializedName;

public class CampaignSocialCard
{
    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("description")
    private String description;

    @SerializedName("title")
    private String title;

    /**
     * The url for the header image for the card.
     *
     * @return
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * A short summary of the campaign to display.
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The title for the card. Typically the subject line of the campaign.
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
