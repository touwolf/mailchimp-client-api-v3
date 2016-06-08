package com.touwolf.mailchimp.api.campaign;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.campaign.folder.CampaignFolderReadRequest;
import com.touwolf.mailchimp.model.campaign.folder.CampaignFolderReadResponse;
import com.touwolf.mailchimp.model.campaign.folder.CampaignFolderResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Organize your campaigns using folders.
 */

@Component
public class CampaignFolder {
    private MailchimpBuilder builder;

    public CampaignFolder builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    /**
     * Create a new campaign folder.
     */
    public MailchimpResponse<CampaignFolderResponse> create(String name) throws MailchimpException {
        if (StringUtils.isBlank(name)) {
            throw new MailchimpException("The field name is required");
        }

        String payload = "{name: " + name + "}";
        return builder.post("/campaign-folders", payload, CampaignFolderResponse.class);
    }

    /**
     * Get all campaign folders
     *
     * @param request Request body parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignFolderReadResponse> read(CampaignFolderReadRequest request) throws MailchimpException {
        String url = "/campaign-folders";
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());

        return builder.get(url, CampaignFolderReadResponse.class);
    }

    /**
     * Get a specific campaign folder
     *
     * @param folderId The unique id for the campaign folder.
     * @param request  Request body parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignFolderResponse> read(String folderId, CampaignFolderReadRequest request) throws MailchimpException {
        if (StringUtils.isBlank(folderId)) {
            throw new MailchimpException("The field folder_id is required");
        }

        String url = "/campaign-folders/" + folderId;
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());

        return builder.get(url, CampaignFolderResponse.class);
    }

    /**
     * Update a campaign folder
     *
     * @param folderId The unique id for the campaign folder.
     * @param name     Name to associate with the folder.
     * @throws MailchimpException
     */
    public MailchimpResponse<CampaignFolderResponse> edit(String folderId, String name) throws MailchimpException {
        if (StringUtils.isBlank(folderId)) {
            throw new MailchimpException("The field folder_id is required");
        }

        if (StringUtils.isBlank(name)) {
            throw new MailchimpException("The field name is required");
        }

        String payload = "{name: " + name + "}";
        return builder.patch("/campaign-folders/" + folderId, payload, CampaignFolderResponse.class);
    }

    /**
     * Delete a campaign folder
     *
     * @param folderId The unique id for the campaign folder.
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> delete(String folderId) throws MailchimpException {
        if (StringUtils.isBlank(folderId)) {
            throw new MailchimpException("The field folder_id is required");
        }

        return builder.delete("/campaign-folders/" + folderId, Void.class);
    }
}
