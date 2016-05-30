package com.touwolf.mailchimp.model;

public class MailchimpErrorField
{
    private String field;

    private String message;

    public MailchimpErrorField(){}

    public MailchimpErrorField(String field, String message)
    {
        this.field = field;
        this.message = message;
    }

    public String getField()
    {
        return field;
    }

    public void setField(String field)
    {
        this.field = field;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
