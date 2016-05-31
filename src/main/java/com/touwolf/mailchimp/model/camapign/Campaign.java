package com.touwolf.mailchimp.model.camapign;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.camapign.data.*;
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

    public MailchimpResponse<CampaignCreateResponse> create(CampaignCreateRequest request) throws MailchimpException
    {
        String payload = GSON.toJson(request);
        return builder.post("/campaigns", payload, CampaignCreateResponse.class);
    }

    public MailchimpResponse<CampaignReadResponse> read(CampaignReadRequest request) throws MailchimpException
    {
        return read(null, request);
    }

    public MailchimpResponse<CampaignReadResponse> read(String campaignId, CampaignReadRequest request) throws MailchimpException
    {
        return builder.get("/campaigns", CampaignReadResponse.class);
    }

    public MailchimpResponse<CampaignEditResponse> edit(String campaignId, CampaignEditRequest request) throws MailchimpException
    {
        return builder.patch("/campaigns", "", CampaignEditResponse.class);
    }

    public MailchimpResponse<Void> delete(String campaignId) throws MailchimpException
    {
        return builder.delete("/campaigns", Void.class);
    }

    public MailchimpResponse<Void> cancelSend(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }

    public MailchimpResponse<Void> pause(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", Void.class);
    }

    public MailchimpResponse<CampaignCreateResponse> replicate(String campaignId) throws MailchimpException
    {
        return builder.post("/campaigns", CampaignCreateResponse.class);
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
