package com.touwolf.mailchimp.model.campaign.data.content;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.MailchimpLinks;

import java.util.List;

public class CampaignContentResponse
{
    @SerializedName("variate_contents")
    private List<CampaignContentVarianteContents> varianteContents;

    @SerializedName("plain_text")
    private String plainText;

    private String html;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * Content options for multivariate campaigns.
     *
     */
    public List<CampaignContentVarianteContents> getVarianteContents() {
        return varianteContents;
    }

    public void setVarianteContents(List<CampaignContentVarianteContents> varianteContents) {
        this.varianteContents = varianteContents;
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
