package com.touwolf.mailchimp.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.model.list.members.*;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Manage members of a specific MailChimp list, including currently subscribed, unsubscribed, and bounced members.
 */
@Component
public class ListsMembers
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsMembers builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    /**
     * Add a new list member
     *
     * @param listId The unique id for the list.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersResponse> create(String listId, ListsMembersRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/members";
        String payload = GSON.toJson(request);
        return builder.post(url, payload, ListsMembersResponse.class);
    }

    /**
     * Get information about members in a list
     *
     * @param listId The unique id for the list.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersReadResponse> read(String listId, ListsMembersReadRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/members";

        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());
        url = MailchimpUtils.formatQueryString(url, "email_type", request.getEmailType());
        url = MailchimpUtils.formatQueryString(url, "status", request.getStatus());
        url = MailchimpUtils.formatQueryString(url, "since_timestamp_opt", request.getSinceTimestampOpt());
        url = MailchimpUtils.formatQueryString(url, "before_timestamp_opt", request.getBeforeTimestampOpt());
        url = MailchimpUtils.formatQueryString(url, "since_last_changed", request.getSinceLastChanged());
        url = MailchimpUtils.formatQueryString(url, "before_last_changed", request.getBeforeLastChanged());
        url = MailchimpUtils.formatQueryString(url, "unique_email_id", request.getUniqueEmailId());
        url = MailchimpUtils.formatQueryString(url, "vip_only", request.getVipOnly());

        return builder.get(url, ListsMembersReadResponse.class);
    }

    /**
     * Get information about a specific list member
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersResponse> read(String listId, String subscriberHash, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsMembersResponse.class);
    }

    /**
     * Update a list member
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersResponse> edit(String listId, String subscriberHash, ListsMembersRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, ListsMembersResponse.class);
    }

    /**
     * Add or update a list member
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param request Request body parameters
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersResponse> editOrAdd(String listId, String subscriberHash, ListsMembersRequest request) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash;
        String payload = GSON.toJson(request);
        return builder.put(url, payload, ListsMembersResponse.class);
    }

    /**
     * Remove a list member
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> delete(String listId, String subscriberHash) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash;
        return builder.delete(url, Void.class);
    }

    /**
     * Get recent list member activity
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersActivityReadResponse> readActivity(String listId, String subscriberHash, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash + "/activity";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsMembersActivityReadResponse.class);
    }

    /**
     * Get the last 50 Goal events for a member on a specific list
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersGoalsReadResponse> readGoals(String listId, String subscriberHash, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash + "/goals";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsMembersGoalsReadResponse.class);
    }

    /**
     * Retrieve recent notes for a specific list member. Add a new note
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param note The content of the note.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersNotesResponse> createNote(String listId, String subscriberHash, String note) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash + "/notes";
        String payload = "{note: \"" + note + "\"}";
        return builder.post(url, payload, ListsMembersNotesResponse.class);
    }

    /**
     * Retrieve recent notes for a specific list member. Get recent notes for a specific list member
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     * @param count The number of records to return.
     * @param offset The number of records from a collection to skip. Iterating over large collections with this parameter can be slow.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersNotesReadResponse> readNotes(String listId, String subscriberHash, String fields, String excludeFields, Integer count, Integer offset) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash + "/notes";
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);
        url = MailchimpUtils.formatQueryString(url, "count", count);
        url = MailchimpUtils.formatQueryString(url, "offset", offset);

        return builder.get(url, ListsMembersNotesReadResponse.class);
    }

    /**
     * Retrieve recent notes for a specific list member. Get a specific note for a specific list member.
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param noteId The id for the note.
     * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersNotesResponse> readNotes(String listId, String subscriberHash, String noteId, String fields, String excludeFields) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        if(StringUtils.isBlank(noteId))
        {
            throw new MailchimpException("The field note_id is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash + "/notes/" + noteId;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsMembersNotesResponse.class);
    }

    /**
     * Retrieve recent notes for a specific list member. Update a note
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param noteId The id for the note.
     * @param note The content of the note.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsMembersNotesResponse> editNotes(String listId, String subscriberHash, String noteId, String note) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field list_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        if(StringUtils.isBlank(noteId))
        {
            throw new MailchimpException("The field note_id is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash + "/notes/" + noteId;
        String payload = "{note: \"" + note + "\"}";
        return builder.patch(url, payload, ListsMembersNotesResponse.class);
    }

    /**
     * Retrieve recent notes for a specific list member. Delete a note
     *
     * @param listId The unique id for the list.
     * @param subscriberHash The MD5 hash of the lowercase version of the list member’s email address.
     * @param noteId The id for the note.
     *
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> deleteNotes(String listId, String subscriberHash, String noteId) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        if(StringUtils.isBlank(subscriberHash))
        {
            throw new MailchimpException("The field subscriber_hash is required");
        }

        if(StringUtils.isBlank(noteId))
        {
            throw new MailchimpException("The field note_id is required");
        }

        String url = "/lists/" + listId + "/members/" + subscriberHash + "/notes/" + noteId;
        return builder.delete(url, Void.class);
    }
}
