package com.touwolf.mailchimp.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.model.list.members.ListsMembersReadRequest;
import com.touwolf.mailchimp.model.list.members.ListsMembersReadResponse;
import com.touwolf.mailchimp.model.list.members.ListsMembersResponse;
import com.touwolf.mailchimp.model.list.segments.ListsSegmentsReadRequest;
import com.touwolf.mailchimp.model.list.segments.ListsSegmentsReadResponse;
import com.touwolf.mailchimp.model.list.segments.ListsSegmentsRequest;
import com.touwolf.mailchimp.model.list.segments.ListsSegmentsResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Manage segments for a specific MailChimp list.
 * A segment is a section of your list that includes only those subscribers who share specific common field information.
 * Learn more about segments in MailChimp.
 */
@Component
public class ListsSegments
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsSegments builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    /**
     * Create a new segment
     *
     * @param listId The unique id for the list.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsSegmentsResponse> create(String listId, ListsSegmentsRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/segments";
        String payload = GSON.toJson(request);
        return builder.post(url, payload, ListsSegmentsResponse.class);
    }

    /**
     * Get information about all segments in a list
     *
     * @param listId The unique id for the list.
     * @param request Query string parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsSegmentsReadResponse> read(String listId, ListsSegmentsReadRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/segments";

        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());
        url = MailchimpUtils.formatQueryString(url, "type", request.getType());
        url = MailchimpUtils.formatQueryString(url, "since_created_at", request.getSinceCreatedAt());
        url = MailchimpUtils.formatQueryString(url, "before_created_at", request.getBeforeCreatedAt());
        url = MailchimpUtils.formatQueryString(url, "since_updated_at", request.getSinceUpdatedAt());
        url = MailchimpUtils.formatQueryString(url, "before_updated_at", request.getBeforeUpdatedAt());

        return builder.get(url, ListsSegmentsReadResponse.class);
    }

    /**
     * Get information about a specific segment
     *
     * @param listId The unique id for the list.
     * @param segmentId The unique id for the segment.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsSegmentsResponse> read(String listId, String segmentId, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(segmentId))
        {
            throw new MailchimpException("The field segment_id is required");
        }

        String url = "/lists/" + listId + "/segments/" + segmentId;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsSegmentsResponse.class);
    }

    /**
     * Update a segment
     *
     * @param listId The unique id for the list.
     * @param segmentId The unique id for the segment.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsSegmentsResponse> edit(String listId, String segmentId, ListsSegmentsRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(segmentId))
        {
            throw new MailchimpException("The field segment_id is required");
        }

        String url = "/lists/" + listId + "/segments/" + segmentId;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, ListsSegmentsResponse.class);
    }

    /**
     * Delete a segment
     *
     * @param listId The unique id for the list.
     * @param segmentId The unique id for the segment.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> delete(String listId, String segmentId) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(segmentId))
        {
            throw new MailchimpException("The field segment_id is required");
        }

        String url = "/lists/" + listId + "/segments/" + segmentId;
        return builder.delete(url, Void.class);
    }

    public MailchimpResponse<ListsMembersResponse> createMembers(String listId, String segmentId, String emailAddress, String status) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(segmentId))
        {
            throw new MailchimpException("The field segment_id is required");
        }

        String url = "/lists/" + listId + "/segments/" + segmentId + "/members";
        String payload = "{\"email_address\": \"" + emailAddress+ "\", \"status\": \"" + status+ "\"}";
        return builder.post(url, payload, ListsMembersResponse.class);
    }

    public MailchimpResponse<ListsMembersReadResponse> readMembers(String listId, String segmentId, ListsMembersReadRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(segmentId))
        {
            throw new MailchimpException("The field segment_id is required");
        }

        String url = "/lists/" + listId + "/segments/" + segmentId + "/members";

        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());

        return builder.get(url, ListsMembersReadResponse.class);
    }

    public MailchimpResponse<Void> deleteMembers(String listId, String segmentId, String subscriberHash) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(segmentId))
        {
            throw new MailchimpException("The field segment_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/segments/" + segmentId + "/members/" + subscriberHash;
        return builder.delete(url, Void.class);
    }
}
