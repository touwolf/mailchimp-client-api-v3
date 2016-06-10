package com.touwolf.mailchimp.api.lists;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.list.clients.ListsClientsReadResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Get information about the most popular email clients for subscribers in a specific MailChimp list
 */
@Component
public class ListsClients {

    private MailchimpBuilder builder;

    public ListsClients builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<ListsClientsReadResponse> read(String listId, String fields, String excludeFields) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/clients";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsClientsReadResponse.class);
    }
}
