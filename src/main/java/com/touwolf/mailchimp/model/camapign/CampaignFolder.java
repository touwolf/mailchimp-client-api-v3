package com.touwolf.mailchimp.model.camapign;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.camapign.data.folder.*;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Organize your campaigns using folders.
 */

@Component
public class CampaignFolder
{
    private MailchimpBuilder builder;

    public CampaignFolder builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    /**
     * Create a new campaign folder.
     *
     * @return
     */
    public MailchimpResponse<CampaignFolderResponse> create(String name) throws MailchimpException
    {
        if(StringUtils.isBlank(name))
        {
            throw new MailchimpException("The field name is required");
        }

        String payload = "{name: " + name + "}";
        return builder.post("/campaign-folders", payload, CampaignFolderResponse.class);
    }

    public MailchimpResponse<CampaignFolderReadResponse> read(CampaignFolderReadRequest request) throws MailchimpException
    {
        String url = "/campaign-folders";

        if(StringUtils.isNotBlank(request.getFields()))
        {
            url += "?" + request.getFields();
        }

        if(StringUtils.isNotBlank(request.getExcludeFields()))
        {
            url += url.contains("?") ? "&exclude_fields=" + request.getExcludeFields() :
                    "?exclude_fields=" + request.getExcludeFields() ;
        }

        if(null != request.getCount())
        {
            url += url.contains("?") ? "&count=" + request.getCount() :
                    "?count=" + request.getCount() ;
        }

        if(null != request.getOffset())
        {
            url += url.contains("?") ? "&offset=" + request.getOffset() :
                    "?offset=" + request.getOffset() ;
        }

        return builder.get(url, CampaignFolderReadResponse.class);
    }

    public MailchimpResponse<CampaignFolderResponse> read(String folderId, CampaignFolderReadRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(folderId))
        {
            throw new MailchimpException("The field folder_id is required");
        }

        String url = "/campaign-folders/" + folderId;

        if(StringUtils.isNotBlank(request.getFields()))
        {
            url += "?" + request.getFields();
        }

        if(StringUtils.isNotBlank(request.getExcludeFields()))
        {
            url += url.contains("?") ? "&exclude_fields=" + request.getExcludeFields() :
                    "?exclude_fields=" + request.getExcludeFields() ;
        }

        return builder.get(url, CampaignFolderResponse.class);
    }

    public MailchimpResponse<CampaignFolderResponse> edit(String folderId, String name) throws MailchimpException
    {
        if(StringUtils.isBlank(folderId))
        {
            throw new MailchimpException("The field folder_id is required");
        }

        if(StringUtils.isBlank(name))
        {
            throw new MailchimpException("The field name is required");
        }

        String payload = "{name: " + name + "}";
        return builder.patch("/campaign-folders/" + folderId, payload, CampaignFolderResponse.class);
    }

    public MailchimpResponse<Void> delete(String folderId) throws MailchimpException
    {
        if(StringUtils.isBlank(folderId))
        {
            throw new MailchimpException("The field folder_id is required");
        }

        return builder.delete("/campaign-folders/" + folderId, Void.class);
    }
}
