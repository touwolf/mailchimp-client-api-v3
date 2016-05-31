package com.touwolf.mailchimp.model.global;

import com.google.gson.annotations.SerializedName;

public class CampaignAbSplitOpts
{
    @SerializedName("split_test")
    private String splitTest;

    @SerializedName("pick_winner")
    private String pickWinner;

    @SerializedName("wait_units")
    private String waitUnits;

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
     *
     * Possible Values:
     * subject
     * from_name
     * schedule
     *
     * @return
     */
    public String getSplitTest() {
        return splitTest;
    }

    public void setSplitTest(String splitTest) {
        this.splitTest = splitTest;
    }

    /**
     * How we should evaluate a winner. Based on ‘opens’, ‘clicks’, or ‘manual’.
     * Possible Values:
     * opens
     * clicks
     * manual
     *
     * @return
     */
    public String getPickWinner() {
        return pickWinner;
    }

    public void setPickWinner(String pickWinner) {
        this.pickWinner = pickWinner;
    }

    /**
     * How unit of time for measuring the winner (‘hours’ or ‘days’). This cannot be changed after a campaign is sent.
     * Possible Values:
     * hours
     * days
     *
     * @return
     */
    public String getWaitUnits() {
        return waitUnits;
    }

    public void setWaitUnits(String waitUnits) {
        this.waitUnits = waitUnits;
    }

    /**
     * The amount of time to wait before picking a winner. This cannot be changed after a campaign is sent.
     *
     * @return
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
     *
     * @return
     */
    public Integer getSplitSize() {
        return splitSize;
    }

    public void setSplitSize(Integer splitSize) {
        this.splitSize = splitSize;
    }

    /**
     * For campaigns split on ‘From Name’, the name for Group A.
     *
     * @return
     */
    public String getFromNameA() {
        return fromNameA;
    }

    public void setFromNameA(String fromNameA) {
        this.fromNameA = fromNameA;
    }

    /**
     * For campaigns split on ‘From Name’, the name for Group B.
     *
     * @return
     */
    public String getFromNameB() {
        return fromNameB;
    }

    public void setFromNameB(String fromNameB) {
        this.fromNameB = fromNameB;
    }

    /**
     * For campaigns split on ‘From Name’, the reply-to address for Group A.
     *
     * @return
     */
    public String getReplyEmailA() {
        return replyEmailA;
    }

    public void setReplyEmailA(String replyEmailA) {
        this.replyEmailA = replyEmailA;
    }

    /**
     * For campaigns split on ‘From Name’, the reply-to address for Group B.
     *
     * @return
     */

    public String getReplyEmailB() {
        return replyEmailB;
    }

    public void setReplyEmailB(String replyEmailB) {
        this.replyEmailB = replyEmailB;
    }

    /**
     * For campaigns split on ‘Subject Line’, the subject line for Group A.
     *
     * @return
     */
    public String getSubjectA() {
        return subjectA;
    }

    public void setSubjectA(String subjectA) {
        this.subjectA = subjectA;
    }

    /**
     * For campaigns split on ‘Subject Line’, the subject line for Group B.
     *
     * @return
     */
    public String getSubjectB() {
        return subjectB;
    }

    public void setSubjectB(String subjectB) {
        this.subjectB = subjectB;
    }

    /**
     * The send time for Group A.
     *
     * @return
     */
    public String getSendTimeA() {
        return sendTimeA;
    }

    public void setSendTimeA(String sendTimeA) {
        this.sendTimeA = sendTimeA;
    }

    /**
     * The send time for Group B.
     *
     * @return
     */
    public String getSendTimeB() {
        return sendTimeB;
    }

    public void setSendTimeB(String sendTimeB) {
        this.sendTimeB = sendTimeB;
    }

    /**
     * The send time for the winning version.
     *
     * @return
     */
    public String getSendTimeWinner() {
        return sendTimeWinner;
    }

    public void setSendTimeWinner(String sendTimeWinner) {
        this.sendTimeWinner = sendTimeWinner;
    }
}
