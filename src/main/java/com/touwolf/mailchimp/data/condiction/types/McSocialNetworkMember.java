package com.touwolf.mailchimp.data.condiction.types;

public class McSocialNetworkMember extends McParent {
    private McSocialNetworkMemberOpEnum op;

    private McSocialNetworkMemberFieldEnum field;

    private McSocialNetworkMemberValueEnum value;

    /**
     * Members who are or are not on a specific social network.
     * Possible Values:
     * <p>
     * member
     * notmember
     */
    public McSocialNetworkMemberOpEnum getOp() {
        return op;
    }

    public void setOp(McSocialNetworkMemberOpEnum op) {
        this.op = op;
    }

    /**
     * The social_network segment field.
     * Possible Values:
     * <p>
     * social_network
     */
    public McSocialNetworkMemberFieldEnum getField() {
        return field;
    }

    public void setField(McSocialNetworkMemberFieldEnum field) {
        this.field = field;
    }

    /**
     * The social network to segment on.
     * Possible Values:
     * <p>
     * twitter
     * facebook
     * linkedin
     * flickr
     * foursquare
     * lastfm
     * myspace
     * quora
     * vimeo
     * yelp
     * youtube
     */
    public McSocialNetworkMemberValueEnum getValue() {
        return value;
    }

    public void setValue(McSocialNetworkMemberValueEnum value) {
        this.value = value;
    }
}
