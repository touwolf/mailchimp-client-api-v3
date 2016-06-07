package com.touwolf.mailchimp.api.campaign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.model.campaign.content.CampaignContentRequest;
import com.touwolf.mailchimp.model.campaign.content.CampaignContentResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Manage the HTML, plain-text, and template content for your MailChimp campaigns.
 */
@Component
public class CampaignContent
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public CampaignContent builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    /**
     * Get the the HTML and plain-text content for a campaign.
     *
     * @param campaignId The unique id for the campaign.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignContentResponse> read(String campaignId, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/campaigns/" + campaignId + "/content";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, CampaignContentResponse.class);
    }

    /**
     * Set campaign content
     * @param campaignId The unique id for the campaign.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignContentResponse> edit(String campaignId, CampaignContentRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/campaigns/" + campaignId + "/content";
        String payload = GSON.toJson(request);
        return builder.put(url, payload, CampaignContentResponse.class);
    }
}
