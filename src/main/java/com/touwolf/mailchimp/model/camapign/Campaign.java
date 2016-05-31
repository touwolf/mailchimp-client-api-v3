package com.touwolf.mailchimp.model.camapign;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.camapign.data.*;
import org.bridje.ioc.Component;

import java.util.List;

@Component
public class Campaign
{
    private MailchimpBuilder builder;

    public Campaign builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<CampaignCreateResponse> create(CampaignCreateRequest request)
    {
        try
        {
            return builder.post("/campaigns", "", CampaignCreateResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<CampaignReadResponse> read(CampaignReadRequest request)
    {
        return read(null, request);
    }

    public MailchimpResponse<CampaignReadResponse> read(String campaignId, CampaignReadRequest request)
    {
        try
        {
            return builder.get("/campaigns", CampaignReadResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<CampaignEditResponse> edit(String campaignId, CampaignEditRequest request)
    {
        try
        {
            return builder.patch("/campaigns", "", CampaignEditResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> delete(String campaignId)
    {
        try
        {
            return builder.delete("/campaigns", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> cancelSend(String campaignId)
    {
        try
        {
            return builder.post("/campaigns", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> pause(String campaignId)
    {
        try
        {
            return builder.post("/campaigns", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<CampaignCreateResponse> replicate(String campaignId)
    {
        try
        {
            return builder.post("/campaigns", CampaignCreateResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> resume(String campaignId)
    {
        try
        {
            return builder.post("/campaigns", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> schedule(String campaignId, CampaignScheduleRequest request)
    {
        try
        {
            return builder.post("/campaigns", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> send(String campaignId)
    {
        try
        {
            return builder.post("/campaigns", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> test(String campaignId, List<String> testEmails, String sendType)
    {
        try
        {
            return builder.post("/campaigns", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> unschedule(String campaignId)
    {
        try
        {
            return builder.post("/campaigns", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }
}
