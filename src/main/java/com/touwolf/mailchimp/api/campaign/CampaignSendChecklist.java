package com.touwolf.mailchimp.api.campaign;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.campaign.checklist.CampaignChecklistResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Review the send checklist for your campaign, and resolve any issues before sending.
 */
@Component
public class CampaignSendChecklist {

    private MailchimpBuilder builder;

    public CampaignSendChecklist builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<CampaignChecklistResponse> read(String campaignId, String fields, String excludeFields) throws MailchimpException {
        if (StringUtils.isBlank(campaignId)) {
            throw new MailchimpException("The field campaign_id is required");
        }

        String url = "/campaigns/" + campaignId + "/send-checklist";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, CampaignChecklistResponse.class);
    }
}
