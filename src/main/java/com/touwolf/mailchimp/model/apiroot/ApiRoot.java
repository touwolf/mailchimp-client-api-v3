package com.touwolf.mailchimp.model.apiroot;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.apiroot.data.ApiRootResponse;
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
    public MailchimpResponse<ApiRootResponse> read() throws MailchimpException
    {
        return read("", "");
    }

    /**
     * Get links to all other resources available in the API.
     *
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     * @return
     */
    public MailchimpResponse<ApiRootResponse> read(String fields, String excludeFields) throws MailchimpException
    {
        String url = "";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ApiRootResponse.class);
    }
}
