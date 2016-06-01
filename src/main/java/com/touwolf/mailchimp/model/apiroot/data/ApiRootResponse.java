package com.touwolf.mailchimp.model.apiroot.data;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.campaign.data.CampaignLinks;

public class ApiRootResponse
{
    @SerializedName("account_id")
    private String accountId;

    @SerializedName("account_name")
    private String accountName;

    @SerializedName("email")
    private String email;

    @SerializedName("username")
    private String username;

    @SerializedName("role")
    private String role;

    private ApiRootContact contact;

    @SerializedName("pro_enabled")
    private Boolean proEnabled;

    @SerializedName("last_login")
    private String lastLogin;

    @SerializedName("total_subscribers")
    private Integer totalSubscribers;

    @SerializedName("industry_stats")
    private ApiRootIndustryStats industryStats;

    @SerializedName("_links")
    private CampaignLinks[] links;

    /**
     * The MailChimp account id
     *
     * @return
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * The login name for the MailChimp account.
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * The account email address.
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The username tied to the account
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * The user role for the account.
     *
     * @return
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Information about the account contact.
     *
     * @return
     */
    public ApiRootContact getContact() {
        return contact;
    }

    public void setContact(ApiRootContact contact) {
        this.contact = contact;
    }

    /**
     * Whether the account includes MailChimp Pro.
     *
     * @return
     */
    public Boolean getProEnabled() {
        return proEnabled;
    }

    public void setProEnabled(Boolean proEnabled) {
        this.proEnabled = proEnabled;
    }

    /**
     * The date and time of the last login for this account.
     *
     * @return
     */
    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * The total number of subscribers across all lists in the account.
     *
     * @return
     */
    public Integer getTotalSubscribers() {
        return totalSubscribers;
    }

    public void setTotalSubscribers(Integer totalSubscribers) {
        this.totalSubscribers = totalSubscribers;
    }

    /**
     * The average campaign statistics for all campaigns in the account’s specified industry.
     *
     * @return
     */
    public ApiRootIndustryStats getIndustryStats() {
        return industryStats;
    }

    public void setIndustryStats(ApiRootIndustryStats industryStats) {
        this.industryStats = industryStats;
    }

    /**
     * A list of link types and descriptions for the API schema documents.
     *
     * @return
     */
    public CampaignLinks[] getLinks() {
        return links;
    }

    public void setLinks(CampaignLinks[] links) {
        this.links = links;
    }
}
