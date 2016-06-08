package com.touwolf.mailchimp;


import com.touwolf.mailchimp.data.MailchimpErrors;

public class MailchimpException extends Exception {
    private int code;

    private MailchimpErrors error;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getError() {
        return error;
    }

    public void setError(MailchimpErrors error) {
        this.error = error;
    }

    public MailchimpException(String message) {
        super(message);
    }

    public MailchimpException(String message, MailchimpErrors error) {
        super(message);
        this.error = error;
    }

    public MailchimpException(MailchimpErrors error, int code) {
        super("");
        this.error = error;
        this.code = code;
    }

    public MailchimpException(String message, MailchimpErrors error, int code) {
        super(message);
        this.error = error;
        this.code = code;
    }

    public MailchimpException(String message, int code) {
        super(message);
        this.error = new MailchimpErrors();
        this.error.setDetail(message);
        this.code = code;
    }

    public MailchimpException(Throwable cause) {
        super(cause);
    }

    public MailchimpException(String message, Throwable cause) {
        super(message, cause);
    }
}
