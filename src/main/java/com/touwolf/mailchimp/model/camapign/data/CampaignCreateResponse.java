package com.touwolf.mailchimp.model.camapign.data;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.global.*;

public class CampaignCreateResponse
{
    private String id;

    private String type;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("archive_url")
    private String archiveUrl;

    @SerializedName("long_archive_url")
    private String longArchiveUrl;

    private String status;

    @SerializedName("emails_sent")
    private Integer emailsSent;

    @SerializedName("send_time")
    private String sendTime;

    @SerializedName("content_type")
    private String contentType;

    private CampaignRecipients recipients;

    private CampaignSettings settings;

    @SerializedName("variate_settings")
    private CampaignVariateSettings variateSettings;

    private CampaignTracking tracking;

    @SerializedName("rss_opts")
    private CampaignRssOpts rssOpts;
}
