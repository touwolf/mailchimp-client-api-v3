package com.touwolf.mailchimp.api.lists;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.list.mergefields.ListsMergeFieldsReadRequest;
import com.touwolf.mailchimp.model.list.mergefields.ListsMergeFieldsReadResponse;
import com.touwolf.mailchimp.model.list.mergefields.ListsMergeFieldsRequest;
import com.touwolf.mailchimp.model.list.mergefields.ListsMergeFieldsResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Manage merge fields (formerly merge vars) for a specific list.
 */
@Component
public class ListsMergeFields {
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsMergeFields builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    /**
     * Add a new merge field
     *
     * @param listId  The unique id for the list.
     * @param request Request body parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMergeFieldsResponse> create(String listId, ListsMergeFieldsRequest request) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/merge-fields";
        String payload = GSON.toJson(request);
        return builder.post(url, payload, ListsMergeFieldsResponse.class);
    }

    /**
     * Get all merge fields for a list
     *
     * @param listId  The unique id for the list.
     * @param request Query string parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMergeFieldsReadResponse> read(String listId, ListsMergeFieldsReadRequest request) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/merge-fields";

        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());
        url = MailchimpUtils.formatQueryString(url, "type", request.getType());
        url = MailchimpUtils.formatQueryString(url, "required", request.getRequired());

        return builder.get(url, ListsMergeFieldsReadResponse.class);
    }

    /**
     * Get a specific merge field
     *
     * @param listId  The unique id for the list.
     * @param mergeId The id for the merge field.
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMergeFieldsResponse> read(String listId, String mergeId) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(mergeId)) {
            throw new MailchimpException("The field merge_id is required");
        }

        String url = "/lists/" + listId + "/merge-fields/" + mergeId;
        return builder.get(url, ListsMergeFieldsResponse.class);
    }

    /**
     * Update a merge field
     *
     * @param listId  The unique id for the list.
     * @param mergeId The id for the merge field.
     * @param request Request body parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMergeFieldsResponse> edit(String listId, String mergeId, ListsMergeFieldsRequest request) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(mergeId)) {
            throw new MailchimpException("The field merge_id is required");
        }

        String url = "/lists/" + listId + "/merge-fields/" + mergeId;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, ListsMergeFieldsResponse.class);
    }

    /**
     * Delete a merge field
     *
     * @param listId  The unique id for the list.
     * @param mergeId The id for the merge field.
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> delete(String listId, String mergeId) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(mergeId)) {
            throw new MailchimpException("The field merge_id is required");
        }

        String url = "/lists/" + listId + "/merge-fields/" + mergeId;
        return builder.delete(url, Void.class);
    }
}
