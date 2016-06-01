package com.touwolf.mailchimp.model.campaign.data.content;

import com.google.gson.annotations.SerializedName;

public class CampaignContentArchive
{
    @SerializedName("archive_content")
    private String archiveContent;

    @SerializedName("archive_type")
    private String archiveType;

    /**
     * The base64-encoded representation of the archive file.
     *
     */
    public String getArchiveContent() {
        return archiveContent;
    }

    public void setArchiveContent(String archiveContent) {
        this.archiveContent = archiveContent;
    }

    /**
     * The type of encoded file. Defaults to zip.
     * Possible Values:
     * zip
     * tar.gz
     * tar.bz2
     * tar
     * tgz
     * tbz
     */
    public String getArchiveType() {
        return archiveType;
    }

    public void setArchiveType(String archiveType) {
        this.archiveType = archiveType;
    }
}
