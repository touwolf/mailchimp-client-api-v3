package com.touwolf.mailchimp.model.campaign.content;

import com.google.gson.annotations.SerializedName;

public enum CampaignContentArchiveTypeEnum {
    @SerializedName("zip")
    ZIP,
    @SerializedName("tar.gz")
    TAR_GZ,
    @SerializedName("tar.bz2")
    TAR_BZ2,
    @SerializedName("tar")
    TAR,
    @SerializedName("tgz")
    TGZ,
    @SerializedName("tbz")
    TBZ
}
