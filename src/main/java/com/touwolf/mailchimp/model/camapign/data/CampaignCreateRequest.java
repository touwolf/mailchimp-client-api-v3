package com.touwolf.mailchimp.model.camapign.data;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.CampaignTracking;
import com.touwolf.mailchimp.model.global.CampaignVariateSettings;
import com.touwolf.mailchimp.model.global.CampaignRecipients;
import com.touwolf.mailchimp.model.global.CampaignSettings;

public class CampaignCreateRequest
{
    private String type;

    private CampaignRecipients recipients;

    private CampaignSettings settings;

    @SerializedName("variate_settings")
    private CampaignVariateSettings variateSettings;

    private CampaignTracking tracking;
}
