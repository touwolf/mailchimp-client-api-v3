package com.touwolf.mailchimp.data.condiction.types;

public class McSocialNetworkFollow extends McParent
{
    private McSocialNetworkFollowOpEnum op;

    private McSocialNetworkFollowFieldEnum field;

    private McSocialNetworkFollowValueEnum value;

    /**
     * Members who are or are not following a linked account on a specific social network.
     * Possible Values:
     *
     * follow
     * notfollow
     */
    public McSocialNetworkFollowOpEnum getOp() {
        return op;
    }

    public void setOp(McSocialNetworkFollowOpEnum op) {
        this.op = op;
    }

    /**
     * The field to segment on.
     * Possible Values:
     *
     * social_network
     */
    public McSocialNetworkFollowFieldEnum getField() {
        return field;
    }

    public void setField(McSocialNetworkFollowFieldEnum field) {
        this.field = field;
    }

    /**
     * The social network to segment on.
     * Possible Values:
     *
     * twitter_follow
     */
    public McSocialNetworkFollowValueEnum getValue() {
        return value;
    }

    public void setValue(McSocialNetworkFollowValueEnum value) {
        this.value = value;
    }
}
