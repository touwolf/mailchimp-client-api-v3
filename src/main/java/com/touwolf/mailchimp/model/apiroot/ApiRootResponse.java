package com.touwolf.mailchimp.model.apiroot;

import com.google.gson.annotations.SerializedName;

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
    private ApiRootLink[] links;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ApiRootContact getContact() {
        return contact;
    }

    public void setContact(ApiRootContact contact) {
        this.contact = contact;
    }

    public Boolean getProEnabled() {
        return proEnabled;
    }

    public void setProEnabled(Boolean proEnabled) {
        this.proEnabled = proEnabled;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getTotalSubscribers() {
        return totalSubscribers;
    }

    public void setTotalSubscribers(Integer totalSubscribers) {
        this.totalSubscribers = totalSubscribers;
    }

    public ApiRootIndustryStats getIndustryStats() {
        return industryStats;
    }

    public void setIndustryStats(ApiRootIndustryStats industryStats) {
        this.industryStats = industryStats;
    }

    public ApiRootLink[] getLinks() {
        return links;
    }

    public void setLinks(ApiRootLink[] links) {
        this.links = links;
    }
}
