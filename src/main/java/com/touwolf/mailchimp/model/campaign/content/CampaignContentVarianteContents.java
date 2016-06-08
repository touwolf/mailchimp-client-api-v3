package com.touwolf.mailchimp.model.campaign.content;

import com.google.gson.annotations.SerializedName;

class CampaignContentVarianteContents {
    @SerializedName("content_label")
    private String contentLabel;

    @SerializedName("plain_text")
    private String plainText;

    private String html;

    private String url;

    private CampaignContentTemplate template;

    private CampaignContentArchive archive;

    /**
     * Label used to identify the content option.
     */
    public String getContentLabel() {
        return contentLabel;
    }

    public void setContentLabel(String contentLabel) {
        this.contentLabel = contentLabel;
    }

    /**
     * The plain-text portion of the campaign. If left unspecified, we’ll generate this automatically.
     */
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    /**
     * The raw HTML for the campaign.
     */
    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * When importing a campaign, the URL for the HTML.
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Use this template to generate the HTML content for the campaign.
     */
    public CampaignContentTemplate getTemplate() {
        return template;
    }

    public void setTemplate(CampaignContentTemplate template) {
        this.template = template;
    }

    /**
     * Available when uploading an archive to create campaign content. The archive should include all campaign content and images. Learn more.
     */
    public CampaignContentArchive getArchive() {
        return archive;
    }

    public void setArchive(CampaignContentArchive archive) {
        this.archive = archive;
    }
}
