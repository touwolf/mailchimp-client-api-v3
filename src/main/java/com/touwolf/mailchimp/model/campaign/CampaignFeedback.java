package com.touwolf.mailchimp.model.campaign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.campaign.data.CampaignRequest;
import com.touwolf.mailchimp.model.campaign.data.CampaignResponse;
import com.touwolf.mailchimp.model.campaign.data.feedback.CampaignFeedbackRequest;
import com.touwolf.mailchimp.model.campaign.data.feedback.CampaignFeedbackResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Post comments, reply to team feedback, and send test emails while you’re working together on a MailChimp campaign.
 */
@Component
public class CampaignFeedback
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public CampaignFeedback builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    /**
     * Add campaign feedback
     *
     * @param campaignId The unique id for the campaign.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignFeedbackResponse> create(String campaignId, String fields, String excludeFields, CampaignFeedbackRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/campaigns/" + campaignId + "/feedback";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        String payload = GSON.toJson(request);
        return builder.post(url, payload, CampaignFeedbackResponse.class);
    }

}
