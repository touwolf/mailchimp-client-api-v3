package com.touwolf.mailchimp.api.lists;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.list.growthhistory.ListsGrowthHistoryReadRequest;
import com.touwolf.mailchimp.model.list.growthhistory.ListsGrowthHistoryReadResponse;
import com.touwolf.mailchimp.model.list.growthhistory.ListsGrowthHistoryResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * View a summary of the month-by-month growth activity for a specific list.
 */
@Component
public class ListsGrowthHistory {
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsGrowthHistory builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    /**
     * Get list growth history data
     *
     * @param listId  The unique id for the list.
     * @param request Query string parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsGrowthHistoryReadResponse> read(String listId, ListsGrowthHistoryReadRequest request) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/growth-history";
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());

        return builder.get(url, ListsGrowthHistoryReadResponse.class);
    }

    /**
     * Get list growth history by month
     *
     * @param listId        The unique id for the list.
     * @param month         A specific month of list growth history.
     * @param fields        A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsGrowthHistoryResponse> read(String listId, String month, String fields, String excludeFields) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(month)) {
            throw new MailchimpException("The field month is required");
        }

        String url = "/lists/" + listId + "/growth-history/" + month;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsGrowthHistoryResponse.class);
    }
}
