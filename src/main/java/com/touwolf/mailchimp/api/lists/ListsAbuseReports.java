package com.touwolf.mailchimp.api.lists;

import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.list.abusereport.ListsAbuseReportsReadRequest;
import com.touwolf.mailchimp.model.list.abusereport.ListsAbuseReportsReadResponse;
import com.touwolf.mailchimp.model.list.abusereport.ListsAbuseReportsResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Manage abuse complaints for a specific list. An abuse complaint occurs when your recipient reports an email as spam in their mail program.
 */
@Component
public class ListsAbuseReports {

    private MailchimpBuilder builder;

    public ListsAbuseReports builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    /**
     * Get all abuse reports for a specific list.
     *
     * @param listId  The unique id for the list.
     * @param request Query string parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsAbuseReportsReadResponse> read(String listId, ListsAbuseReportsReadRequest request) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/abuse-reports";
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());

        return builder.get(url, ListsAbuseReportsReadResponse.class);
    }

    /**
     * Get details about a specific abuse report.
     *
     * @param listId   The unique id for the list.
     * @param reportId The id for the abuse report.
     * @param request  Query string parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsAbuseReportsResponse> read(String listId, String reportId, ListsAbuseReportsReadRequest request) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field report_id is required");
        }

        String url = "/lists/" + listId + "/abuse-reports/" + reportId;
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());

        return builder.get(url, ListsAbuseReportsResponse.class);
    }
}
