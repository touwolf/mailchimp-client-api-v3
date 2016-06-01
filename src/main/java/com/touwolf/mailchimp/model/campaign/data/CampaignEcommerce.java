package com.touwolf.mailchimp.model.campaign.data;

import com.google.gson.annotations.SerializedName;

class CampaignEcommerce
{
    @SerializedName("total_orders")
    private Integer totalOrders;

    @SerializedName("total_spent")
    private Integer totalSpent;

    @SerializedName("total_revenue")
    private Integer totalRevenue;

    /**
     * The total orders for a campaign.
     *
     */
    public Integer getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }

    /**
     * The total spent for a campaign. Calculated as the sum of all order totals with no deductions.
     *
     */
    public Integer getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(Integer totalSpent) {
        this.totalSpent = totalSpent;
    }

    /**
     * The total revenue for a campaign. Calculated as the sum of all order totals minus shipping and tax totals.
     *
     */
    public Integer getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Integer totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
