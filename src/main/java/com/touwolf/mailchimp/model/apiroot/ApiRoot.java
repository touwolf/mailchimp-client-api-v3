package com.touwolf.mailchimp.model.apiroot;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.apiroot.data.ApiRootResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

@Component
public class ApiRoot
{
    private MailchimpBuilder builder;

    public ApiRoot builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    /**
     * Get links to all other resources available in the API.
     *
     * @return
     */
    public MailchimpResponse<ApiRootResponse> getApiRoot()
    {
        return getApiRoot("", "");
    }

    /**
     * Get links to all other resources available in the API.
     *
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     * @return
     */
    public MailchimpResponse<ApiRootResponse> getApiRoot(String fields, String excludeFields)
    {
        try
        {
            String queryString = "";
            if(StringUtils.isNotBlank(fields))
            {
                queryString += "?fields=" + fields;
            }

            if(StringUtils.isNotBlank(excludeFields))
            {
                queryString += StringUtils.isBlank(queryString) ?
                        "?exclude_fields=" + excludeFields : "&exclude_fields=" + excludeFields;
            }

            return builder.get(queryString, ApiRootResponse.class);
        }
        catch (MailchimpException ex)
        {

        }

        return null;
    }
}
