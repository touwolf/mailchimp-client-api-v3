package com.touwolf.mailchimp.data;

public class MailchimpErrors {
    private String type;

    private String title;

    private Integer status;

    private String detail;

    private String instance;

    /**
     * An absolute URI that identifies the problem type.
     * When dereferenced, it should provide human-readable documentation for the problem type.
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * A short, human-readable summary of the problem type.
     * It shouldn’t change based on the occurrence of the problem, except for purposes of localization.
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The HTTP status code (RFC2616, Section 6) generated by the origin server for this occurrence of the problem.
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * A human-readable explanation specific to this occurrence of the problem. Learn more about errors.
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * A string that identifies this specific occurrence of the problem. Please provide this ID when contacting support.
     */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }
}
