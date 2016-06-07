package com.touwolf.mailchimp.model.batch.data;

import com.google.gson.annotations.SerializedName;
import com.touwolf.mailchimp.model.MailchimpLinks;

import java.util.List;

public class BatchResponse
{
    private String id;

    private String status;

    @SerializedName("total_operations")
    private Integer totalOperations;

    @SerializedName("finished_operations")
    private Integer finishedOperations;

    @SerializedName("errored_operations")
    private Integer erroredOperations;

    @SerializedName("submitted_at")
    private String submittedAt;

    @SerializedName("completed_at")
    private String completedAt;

    @SerializedName("response_body_url")
    private String responseBodyUrl;

    @SerializedName("_links")
    private List<MailchimpLinks> links;

    /**
     * A string that uniquely identifies this batch request.
     *
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The status of the batch call.
     * Possible Values:

     * pending
     * started
     * finished
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The total number of operations to complete as part of this batch request.
     * For GET requests requiring pagination, each page counts as a separate operation.
     *
     */
    public Integer getTotalOperations() {
        return totalOperations;
    }

    public void setTotalOperations(Integer totalOperations) {
        this.totalOperations = totalOperations;
    }

    /**
     * The number of completed operations. This includes operations that returned an error.
     *
     */
    public Integer getFinishedOperations() {
        return finishedOperations;
    }

    public void setFinishedOperations(Integer finishedOperations) {
        this.finishedOperations = finishedOperations;
    }

    /**
     * The number of completed operations that returned an error.
     *
     */
    public Integer getErroredOperations() {
        return erroredOperations;
    }

    public void setErroredOperations(Integer erroredOperations) {
        this.erroredOperations = erroredOperations;
    }

    /**
     * The date and time when the server received the batch request.
     *
     */
    public String getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
    }

    /**
     * The date and time when all operations in the batch request completed.
     *
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * The URL of the gzipped archive of the results of all the operations.
     *
     */
    public String getResponseBodyUrl() {
        return responseBodyUrl;
    }

    public void setResponseBodyUrl(String responseBodyUrl) {
        this.responseBodyUrl = responseBodyUrl;
    }

    /**
     * A list of link types and descriptions for the API schema documents.
     *
     */
    public List<MailchimpLinks> getLinks() {
        return links;
    }

    public void setLinks(List<MailchimpLinks> links) {
        this.links = links;
    }
}
