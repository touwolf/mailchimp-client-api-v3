package com.touwolf.mailchimp.api.campaign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.model.campaign.CampaignResponse;
import com.touwolf.mailchimp.model.campaign.feedback.CampaignFeedbackReadResponse;
import com.touwolf.mailchimp.model.campaign.feedback.CampaignFeedbackRequest;
import com.touwolf.mailchimp.model.campaign.feedback.CampaignFeedbackResponse;
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

    /**
     * Get team feedback while you’re working together on a MailChimp campaign.
     *
     * @param campaignId The unique id for the campaign.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignFeedbackReadResponse> read(String campaignId, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/campaigns/" + campaignId + "/feedback";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, CampaignFeedbackReadResponse.class);
    }

    /**
     * Get a specific feedback message from a campaign.
     *
     * @param campaignId The unique id for the campaign.
     * @param feedbackId The unique id for the feedback message.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignFeedbackResponse> read(String campaignId, String feedbackId, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        if(StringUtils.isBlank(feedbackId))
        {
            throw new MailchimpException("The field feedback_id is required");
        }

        String url = "/campaigns/" + campaignId + "/feedback/" + feedbackId;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, CampaignFeedbackResponse.class);
    }

    /**
     * Update a specific feedback message for a campaign.
     *
     * @param campaignId The unique id for the campaign.
     * @param feedbackId The unique id for the feedback message.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignResponse> edit(String campaignId, String feedbackId, CampaignFeedbackRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        if(StringUtils.isBlank(feedbackId))
        {
            throw new MailchimpException("The field feedback_id is required");
        }

        String url = "/campaigns/" + campaignId + "/feedback/" + feedbackId;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, CampaignResponse.class);
    }

    /**
     * Delete a campaign feedback message
     *
     * @param campaignId The unique id for the campaign.
     * @param feedbackId The unique id for the feedback message.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> delete(String campaignId, String feedbackId) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        if(StringUtils.isBlank(feedbackId))
        {
            throw new MailchimpException("The field feedback_id is required");
        }

        String url = "/campaigns/" + campaignId + "/feedback/" + feedbackId;
        return builder.delete(url, Void.class);
    }
}
