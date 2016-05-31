package com.touwolf.mailchimp.model.global;

import com.google.gson.annotations.SerializedName;

public class CampaignVariateSettings
{
    @SerializedName("winning_combination_id")
    private String winningCombinationId;

    @SerializedName("winning_campaign_id")
    private String winningCampaignId;

    @SerializedName("winner_criteria")
    private String winnerCriteria;

    @SerializedName("wait_time")
    private Integer waitTime;

    @SerializedName("test_size")
    private Integer testSize;

    @SerializedName("subject_lines")
    private String subjectLines;

    @SerializedName("send_times")
    private String sendTime;

    @SerializedName("from_names")
    private String from_names;

    @SerializedName("reply_to_addresses")
    private String replyToAddresses;

    private String contents;

    private CampaignCombinatios combinatios;

    /**
     * ID for the winning combination.
     *
     * @return
     */
    public String getWinningCombinationId() {
        return winningCombinationId;
    }

    public void setWinningCombinationId(String winningCombinationId) {
        this.winningCombinationId = winningCombinationId;
    }

    /**
     * ID of the campaign that was sent to the remaining recipients based on the winning combination.
     *
     * @return
     */
    public String getWinningCampaignId() {
        return winningCampaignId;
    }

    public void setWinningCampaignId(String winningCampaignId) {
        this.winningCampaignId = winningCampaignId;
    }

    /**
     * The combination that performs the best. This may be determined automatically by click rate, open rate, or total revenue—or
     * you may choose manually based on the reporting data you find the most valuable. For Multivariate Campaigns testing send_time,
     * winner_critera is ignored. For Multivariate Campaigns with ‘manual’ as the winner_citeria, the winner must be chosen in
     * the MailChimp web application.
     *
     * @return
     */
    public String getWinnerCriteria() {
        return winnerCriteria;
    }

    public void setWinnerCriteria(String winnerCriteria) {
        this.winnerCriteria = winnerCriteria;
    }

    /**
     *  The number of minutes to wait before choosing the winning campaign. The value of wait_time must be greater than 0 and in whole hours, specified in minutes.
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
     * The percentage of recipients to send the test combinations to, must be a value between 10 and 100.
     *
     * @return
     */
    public Integer getTestSize() {
        return testSize;
    }

    public void setTestSize(Integer testSize) {
        this.testSize = testSize;
    }

    /**
     * The possible subject lines to test. If no subject lines are provided, settings.subject_line will be used.
     *
     * @return
     */
    public String getSubjectLines() {
        return subjectLines;
    }

    public void setSubjectLines(String subjectLines) {
        this.subjectLines = subjectLines;
    }

    /**
     * The possible send times to test. The times provided should be in the format YYYY-MM-DD HH:MM:SS.
     * If send_times are provided to test, the test_size will be set to 100% and winner_criteria will be ignored.
     *
     * @return
     */
    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * The possible from names. The number of from_names provided must match the number of reply_to_addresses.
     * If no from_names are provided, settings.from_name will be used.
     *
     * @return
     */
    public String getFrom_names() {
        return from_names;
    }

    public void setFrom_names(String from_names) {
        this.from_names = from_names;
    }

    /**
     * The possible reply-to addresses. The number of reply_to_addresses provided must match the number of from_names.
     * If no reply_to_addresses are provided, settings.reply_to will be used.
     *
     * @return
     */
    public String getReplyToAddresses() {
        return replyToAddresses;
    }

    public void setReplyToAddresses(String replyToAddresses) {
        this.replyToAddresses = replyToAddresses;
    }

    /**
     * Descriptions of possible email contents. To set campaign contents, make a PUT request to
     * /campaigns/{campaign_id}/content with the field ‘variate_contents’.
     *
     * @return
     */
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * Combinations of possible variables used to build emails.
     *
     * @return
     */
    public CampaignCombinatios getCombinatios() {
        return combinatios;
    }

    public void setCombinatios(CampaignCombinatios combinatios) {
        this.combinatios = combinatios;
    }
}
