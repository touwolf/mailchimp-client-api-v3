package com.touwolf.mailchimp.model.camapign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.camapign.data.*;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

import java.util.List;

/**
 * Campaigns are how you send emails to your MailChimp list. Use the Campaigns API calls to manage campaigns in your MailChimp account.
 *
 */
@Component
public class Campaign
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public Campaign builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    /**
     * Create a new campaign
     *
     * @param request Request body parameters
     * @return
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignResponse> create(CampaignRequest request) throws MailchimpException
    {
        String payload = GSON.toJson(request);
        return builder.post("/campaigns", payload, CampaignResponse.class);
    }

    /**
     * Get all campaigns
     *
     * @param request Query string parameters
     * @return
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignReadResponse> read(CampaignReadRequest request) throws MailchimpException
    {
        String url = "/campaigns";
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());
        url = MailchimpUtils.formatQueryString(url, "type", request.getType());
        url = MailchimpUtils.formatQueryString(url, "status", request.getStatus());
        url = MailchimpUtils.formatQueryString(url, "before_send_time", request.getBeforeSendTime());
        url = MailchimpUtils.formatQueryString(url, "since_send_time", request.getSinceSendTime());
        url = MailchimpUtils.formatQueryString(url, "before_create_time", request.getBeforeCreateTime());
        url = MailchimpUtils.formatQueryString(url, "since_create_time", request.getSinceCreateTime());
        url = MailchimpUtils.formatQueryString(url, "list_id", request.getListId());

        return builder.get(url, CampaignReadResponse.class);
    }

    /**
     * Get information about a specific campaign
     *
     * @param campaignId The unique id for the campaign.
     * @param request Query string parameters
     * @return
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignResponse> read(String campaignId, CampaignReadRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/campaigns/" + campaignId;
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());

        return builder.get(url, CampaignResponse.class);
    }

    /**
     * Update the settings for a campaign
     *
     * @param campaignId The unique id for the campaign.
     * @param request Request body parameters
     * @return
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignResponse> edit(String campaignId, CampaignRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/campaigns/" + campaignId;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, CampaignResponse.class);
    }

    /**
     * Delete a campaign
     *
     * @param campaignId The unique id for the campaign.
     * @return
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> delete(String campaignId) throws MailchimpException
    {
        if(StringUtils.isBlank(campaignId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/campaigns/" + campaignId;
        return builder.delete(url, Void.class);
    }

    public MailchimpResponse<Void> cancelSend(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }

    public MailchimpResponse<Void> pause(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }

    public MailchimpResponse<CampaignResponse> replicate(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", CampaignResponse.class);
    }

    public MailchimpResponse<Void> resume(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }

    public MailchimpResponse<Void> schedule(String campaignId, CampaignScheduleRequest request) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }

    public MailchimpResponse<Void> send(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }

    public MailchimpResponse<Void> test(String campaignId, List<String> testEmails, String sendType) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }

    public MailchimpResponse<Void> unschedule(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }
}
