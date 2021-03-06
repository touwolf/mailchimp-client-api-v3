package com.touwolf.mailchimp.model.campaign;

import com.google.gson.annotations.SerializedName;

class CampaignAbSplitOpts {
    @SerializedName("split_test")
    private CampaignSplitTestEnum splitTest;

    @SerializedName("pick_winner")
    private CampaignPickWinnerEnum pickWinner;

    @SerializedName("wait_units")
    private CampaignWaitUnits waitUnits;

    @SerializedName("wait_time")
    private Integer waitTime;

    @SerializedName("split_size")
    private Integer splitSize;

    @SerializedName("from_name_a")
    private String fromNameA;

    @SerializedName("from_name_b")
    private String fromNameB;

    @SerializedName("reply_email_a")
    private String replyEmailA;

    @SerializedName("reply_email_b")
    private String replyEmailB;

    @SerializedName("subject_a")
    private String subjectA;

    @SerializedName("subject_b")
    private String subjectB;

    @SerializedName("send_time_a")
    private String sendTimeA;

    @SerializedName("send_time_b")
    private String sendTimeB;

    @SerializedName("send_time_winner")
    private String sendTimeWinner;

    /**
     * The type of AB split to run.
     * <p>
     * Possible Values:
     * <p>
     * subject
     * from_name
     * schedule
     */
    public CampaignSplitTestEnum getSplitTest() {
        return splitTest;
    }

    public void setSplitTest(CampaignSplitTestEnum splitTest) {
        this.splitTest = splitTest;
    }

    /**
     * How we should evaluate a winner. Based on ‘opens’, ‘clicks’, or ‘manual’.
     * <p>
     * Possible Values:
     * <p>
     * opens
     * clicks
     * manual
     */
    public CampaignPickWinnerEnum getPickWinner() {
        return pickWinner;
    }

    public void setPickWinner(CampaignPickWinnerEnum pickWinner) {
        this.pickWinner = pickWinner;
    }

    /**
     * How unit of time for measuring the winner (‘hours’ or ‘days’). This cannot be changed after a campaign is sent.
     * <p>
     * Possible Values:
     * <p>
     * hours
     * days
     */
    public CampaignWaitUnits getWaitUnits() {
        return waitUnits;
    }

    public void setWaitUnits(CampaignWaitUnits waitUnits) {
        this.waitUnits = waitUnits;
    }

    /**
     * The amount of time to wait before picking a winner. This cannot be changed after a campaign is sent.
     */
    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    /**
     * The size of the split groups. Campaigns split based on ‘schedule’ are forced to have a 50⁄50 split.
     * Valid split integers are between 1-50.
     */
    public Integer getSplitSize() {
        return splitSize;
    }

    public void setSplitSize(Integer splitSize) {
        this.splitSize = splitSize;
    }

    /**
     * For campaigns split on ‘From Name’, the name for Group A.
     */
    public String getFromNameA() {
        return fromNameA;
    }

    public void setFromNameA(String fromNameA) {
        this.fromNameA = fromNameA;
    }

    /**
     * For campaigns split on ‘From Name’, the name for Group B.
     */
    public String getFromNameB() {
        return fromNameB;
    }

    public void setFromNameB(String fromNameB) {
        this.fromNameB = fromNameB;
    }

    /**
     * For campaigns split on ‘From Name’, the reply-to address for Group A.
     */
    public String getReplyEmailA() {
        return replyEmailA;
    }

    public void setReplyEmailA(String replyEmailA) {
        this.replyEmailA = replyEmailA;
    }

    /**
     * For campaigns split on ‘From Name’, the reply-to address for Group B.
     */
    public String getReplyEmailB() {
        return replyEmailB;
    }

    public void setReplyEmailB(String replyEmailB) {
        this.replyEmailB = replyEmailB;
    }

    /**
     * For campaigns split on ‘Subject Line’, the subject line for Group A.
     */
    public String getSubjectA() {
        return subjectA;
    }

    public void setSubjectA(String subjectA) {
        this.subjectA = subjectA;
    }

    /**
     * For campaigns split on ‘Subject Line’, the subject line for Group B.
     * return
     */
    public String getSubjectB() {
        return subjectB;
    }

    public void setSubjectB(String subjectB) {
        this.subjectB = subjectB;
    }

    /**
     * The send time for Group A.
     */
    public String getSendTimeA() {
        return sendTimeA;
    }

    public void setSendTimeA(String sendTimeA) {
        this.sendTimeA = sendTimeA;
    }

    /**
     * The send time for Group B.
     */
    public String getSendTimeB() {
        return sendTimeB;
    }

    public void setSendTimeB(String sendTimeB) {
        this.sendTimeB = sendTimeB;
    }

    /**
     * The send time for the winning version.
     */
    public String getSendTimeWinner() {
        return sendTimeWinner;
    }

    public void setSendTimeWinner(String sendTimeWinner) {
        this.sendTimeWinner = sendTimeWinner;
    }
}
