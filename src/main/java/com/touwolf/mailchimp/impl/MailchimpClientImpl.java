package com.touwolf.mailchimp.impl;

import com.touwolf.mailchimp.MailchimpClient;
import com.touwolf.mailchimp.model.apiroot.ApiRoot;
import com.touwolf.mailchimp.model.campaign.*;
import org.bridje.ioc.Ioc;

public class MailchimpClientImpl implements MailchimpClient
{
    private MailchimpBuilder builder;

    private ApiRoot apiRoot;

    private CampaignFolder campaignFolder;

    private Campaign campaign;

    private CampaignContent campaignContent;

    private CampaignFeedback campaignFeedback;

    private CampaignSendChecklist campaignSendChecklist;

    public MailchimpClientImpl(String username, String apiKey)
    {
        builder = new MailchimpBuilder(MailchimpUtils.getApiUrl(apiKey), username, apiKey, 30000);
    }

    @Override
    public ApiRoot apiRoot()
    {
        return getApiRoot().builder(builder);
    }

    @Override
    public CampaignFolder campaignFolder()
    {
        return getCampaignFolder().builder(builder);
    }

    @Override
    public Campaign campaign()
    {
        return getCampaign().builder(builder);
    }

    @Override
    public CampaignContent campaignContent() {
        return getCampaignContent().builder(builder);
    }

    @Override
    public CampaignFeedback campaignFeedback()
    {
        return getCampaignFeedback().builder(builder);
    }

    @Override
    public CampaignSendChecklist campaignSendChecklist()
    {
        return getCampaignSendChecklist().builder(builder);
    }

    private ApiRoot getApiRoot()
    {
        if(null == apiRoot)
        {
            apiRoot = Ioc.context().find(ApiRoot.class);
        }

        return apiRoot;
    }

    private CampaignFolder getCampaignFolder()
    {
        if(null == campaignFolder)
        {
            campaignFolder = Ioc.context().find(CampaignFolder.class);
        }

        return campaignFolder;
    }

    private Campaign getCampaign()
    {
        if(null == campaign)
        {
            campaign = Ioc.context().find(Campaign.class);
        }

        return campaign;
    }

    private CampaignContent getCampaignContent()
    {
        if(null == campaignContent)
        {
            campaignContent = Ioc.context().find(CampaignContent.class);
        }

        return campaignContent;
    }

    private CampaignFeedback getCampaignFeedback()
    {
        if(null == campaignFeedback)
        {
            campaignFeedback = Ioc.context().find(CampaignFeedback.class);
        }

        return campaignFeedback;
    }

    private CampaignSendChecklist getCampaignSendChecklist()
    {
        if(null == campaignSendChecklist)
        {
            campaignSendChecklist = Ioc.context().find(CampaignSendChecklist.class);
        }

        return campaignSendChecklist;
    }
}
