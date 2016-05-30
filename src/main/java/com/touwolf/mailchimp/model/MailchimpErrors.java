package com.touwolf.mailchimp.model;

import java.util.LinkedList;
import java.util.List;

public class MailchimpErrors
{
    List<MailchimpErrorField> errors;

    public MailchimpErrors(){}

    public MailchimpErrors(String message)
    {
        getErrors().add(new MailchimpErrorField(null, message));
    }

    public MailchimpErrors(String field, String message)
    {
        getErrors().add(new MailchimpErrorField(field, message));
    }

    public List<MailchimpErrorField> getErrors()
    {
        if(null == errors)
        {
            errors = new LinkedList<>();
        }

        return errors;
    }

    public void setErrors(List<MailchimpErrorField> errors)
    {
        this.errors = errors;
    }
}
