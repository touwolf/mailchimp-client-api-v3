package com.touwolf.mailchimp.model.campaign.data.content;

import com.google.gson.annotations.SerializedName;

class CampaignContentVarianteContents
{
    @SerializedName("content_label")
    private String contentLabel;

    @SerializedName("plain_text")
    private String plainText;

    private String html;

    /**
     * Label used to identify the content option.
     *
     */
    public String getContentLabel() {
        return contentLabel;
    }

    public void setContentLabel(String contentLabel) {
        this.contentLabel = contentLabel;
    }

    /**
     * The plain-text portion of the campaign. If left unspecified, we’ll generate this automatically.
     *
     */
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    /**
     * The raw HTML for the campaign.
     *
     */
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
