package com.touwolf.mailchimp.impl;

import com.touwolf.mailchimp.MailchimpClient;
import com.touwolf.mailchimp.model.apiroot.ApiRoot;
import com.touwolf.mailchimp.model.campaign.Campaign;
import com.touwolf.mailchimp.model.campaign.CampaignContent;
import com.touwolf.mailchimp.model.campaign.CampaignFolder;
import org.bridje.ioc.Ioc;

public class MailchimpClientImpl implements MailchimpClient
{
    private MailchimpBuilder builder;

    private ApiRoot apiRoot;

    private CampaignFolder campaignFolder;

    private Campaign campaign;

    private CampaignContent campaignContent;

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
}
