
package com.touwolf.mailchimp;


import com.touwolf.mailchimp.model.MailchimpErrors;

public class MailchimpException extends Exception
{
    private int code;

    private Object error;

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public Object getError()
    {
        return error;
    }

    public void setError(Object error)
    {
        this.error = error;
    }

    public MailchimpException(String message)
    {
        super(message);
    }

    public MailchimpException(String message, Object error)
    {
        super(message);
        this.error = error;
    }

    public MailchimpException(Object error, int code)
    {
        super("");
        this.error = error;
        this.code = code;
    }

    public MailchimpException(String message, Object error, int code)
    {
        super(message);
        this.error = error;
        this.code = code;
    }

    public MailchimpException(String message, int code)
    {
        super(message);
        this.error = message;
        this.code = code;
    }

    public MailchimpException(String field, String message, int code)
    {
        super(message);
        this.error = new MailchimpErrors(field, message);
        this.code = code;
    }

    public MailchimpException(Throwable cause)
    {
        super(cause);
    }

    public MailchimpException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
