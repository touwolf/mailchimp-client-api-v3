package com.touwolf.mailchimp.impl;

import com.touwolf.mailchimp.MailchimpClient;
import com.touwolf.mailchimp.model.apiroot.ApiRoot;
import com.touwolf.mailchimp.model.campaign.*;
import com.touwolf.mailchimp.model.list.*;
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

    private Lists lists;

    private ListsAbuseReports listsAbuseReports;

    private ListsActivity listsActivity;

    private ListsGrowthHistory listsGrowthHistory;

    private ListsInterestCategories listsInterestCategories;

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

    @Override
    public Lists lists() {
        return getLists().builder(builder);
    }

    @Override
    public ListsAbuseReports listsAbuseReports() {
        return getListsAbuseReports().builder(builder);
    }

    @Override
    public ListsActivity listsActivity() {
        return getListsActivity().builder(builder);
    }

    @Override
    public ListsGrowthHistory listsGrowthHistory() {
        return getListsGrowthHistory().builder(builder);
    }

    @Override
    public ListsInterestCategories listsInterestCategories() {
        return getListsInterestCategories().builder(builder);
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

    private Lists getLists()
    {
        if(null == lists)
        {
            lists = Ioc.context().find(Lists.class);
        }

        return lists;
    }

    private ListsAbuseReports getListsAbuseReports()
    {
        if(null == listsAbuseReports)
        {
            listsAbuseReports = Ioc.context().find(ListsAbuseReports.class);
        }

        return listsAbuseReports;
    }

    private ListsActivity getListsActivity()
    {
        if(null == listsActivity)
        {
            listsActivity = Ioc.context().find(ListsActivity.class);
        }

        return listsActivity;
    }

    private ListsGrowthHistory getListsGrowthHistory()
    {
        if(null == listsGrowthHistory)
        {
            listsGrowthHistory = Ioc.context().find(ListsGrowthHistory.class);
        }

        return listsGrowthHistory;
    }

    private ListsInterestCategories getListsInterestCategories()
    {
        if(null == listsInterestCategories)
        {
            listsInterestCategories = Ioc.context().find(ListsInterestCategories.class);
        }

        return listsInterestCategories;
    }
}
