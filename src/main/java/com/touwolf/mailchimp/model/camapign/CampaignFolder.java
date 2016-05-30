package com.touwolf.mailchimp.model.camapign;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.camapign.data.CampaignFolderCreateRequest;
import com.touwolf.mailchimp.model.camapign.data.CampaignFolderCreateResponse;
import org.bridje.ioc.Component;

@Component
public class CampaignFolder
{
    private MailchimpBuilder builder;

    public CampaignFolder builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<CampaignFolderCreateResponse> create(CampaignFolderCreateRequest request)
    {
        try
        {
            builder.post("/campaigns", "", CampaignFolderCreateResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }
}
