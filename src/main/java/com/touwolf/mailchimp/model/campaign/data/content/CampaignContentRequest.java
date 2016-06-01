package com.touwolf.mailchimp.model.campaign.data.content;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CampaignContentRequest
{
    @SerializedName("plain_text")
    private String plainText;

    private String html;

    private String url;

    private CampaignContentTemplate template;

    private CampaignContentArchive archive;

    @SerializedName("variate_contents")
    private List<CampaignContentVarianteContents> variateContents;

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

    /**
     * When importing a campaign, the URL where the HTML lives.
     *
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Use this template to generate the HTML content of the campaign
     *
     */
    public CampaignContentTemplate getTemplate() {
        return template;
    }

    public void setTemplate(CampaignContentTemplate template) {
        this.template = template;
    }

    /**
     * Available when uploading an archive to create campaign content. The archive should include all campaign content and images. Learn more.
     *
     */
    public CampaignContentArchive getArchive() {
        return archive;
    }

    public void setArchive(CampaignContentArchive archive) {
        this.archive = archive;
    }

    /**
     * Content options for Multivariate Campaigns. Each content option must provide HTML content and may optionally provide plain text.
     * For campaigns not testing content, only one object should be provided.
     *
     */
    public List<CampaignContentVarianteContents> getVariateContents() {
        return variateContents;
    }

    public void setVariateContents(List<CampaignContentVarianteContents> variateContents) {
        this.variateContents = variateContents;
    }
}
