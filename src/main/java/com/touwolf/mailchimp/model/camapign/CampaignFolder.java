package com.touwolf.mailchimp.model.camapign;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.camapign.data.folder.*;
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
            return builder.post("/campaign-folders", "", CampaignFolderCreateResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<CampaignFolderReadResponse> read(CampaignFolderReadRequest request)
    {
        return read(null, request);
    }

    public MailchimpResponse<CampaignFolderReadResponse> read(String folderId, CampaignFolderReadRequest request)
    {
        try
        {
            return builder.get("/campaign-folders", CampaignFolderReadResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<CampaignFolderEditResponse> edit(String folderId, CampaignFolderEditRequest request)
    {
        try
        {
            return builder.patch("/campaign-folders", "", CampaignFolderEditResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }

    public MailchimpResponse<Void> delete(String folderId)
    {
        try
        {
            return builder.delete("/campaign-folders", Void.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }
}
