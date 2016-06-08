package com.touwolf.mailchimp.api.lists;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.list.interestcategories.*;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Manage interest categories for a specific list. Interest categories organize interests,
 * which are used to group subscribers based on their preferences.
 * These correspond to ‘group titles’ in the MailChimp application. Learn more about groups in MailChimp.
 */
@Component
public class ListsInterestCategories {
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsInterestCategories builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    /**
     * Create a new interest category
     *
     * @param listId  The unique id for the list.
     * @param request Request body parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsInterestCategoriesResponse> create(String listId, ListsInterestCategoriesRequest request) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories";
        String payload = GSON.toJson(request);
        return builder.post(url, payload, ListsInterestCategoriesResponse.class);
    }

    /**
     * Get information about a list’s interest categories
     *
     * @param listId  The unique id for the list.
     * @param request Query string parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsInterestCategoriesReadResponse> read(String listId, ListsInterestCategoriesReadRequest request) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories";
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());
        url = MailchimpUtils.formatQueryString(url, "type", request.getType());
        return builder.get(url, ListsInterestCategoriesReadResponse.class);
    }

    /**
     * Get information about a specific interest category.
     *
     * @param listId             The unique id for the list.
     * @param interestCategoryId The unique id for the interest category.
     * @param fields             A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields      A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsInterestCategoriesResponse> read(String listId, String interestCategoryId, String fields, String excludeFields) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsInterestCategoriesResponse.class);
    }

    /**
     * Update a specific interest category
     *
     * @param listId             The unique id for the list.
     * @param interestCategoryId The unique id for the interest category.
     * @param request            Request body parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsInterestCategoriesResponse> edit(String listId, String interestCategoryId, ListsInterestCategoriesRequest request) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, ListsInterestCategoriesResponse.class);
    }

    /**
     * Delete a specific interest category
     *
     * @param listId             The unique id for the list.
     * @param interestCategoryId The unique id for the interest category.
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> delete(String listId, String interestCategoryId) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field campaign_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId;
        return builder.delete(url, Void.class);
    }

    /**
     * Manage interests for a specific MailChimp list. Assign subscribers to interests to group them together.
     * Interests are referred to as ‘group names’ in the MailChimp application. Learn more about using groups in MailChimp.
     */

    /**
     * Create a new interest in a specific category
     *
     * @param listId             The unique id for the list.
     * @param interestCategoryId The unique id for the interest category.
     * @param name               The name of the interest. This can be shown publicly on a subscription form.
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsInterestCategoriesInterestResponse> createInterest(String listId, String interestCategoryId, String name) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId;
        String payload = "{name: " + name + "}";
        return builder.post(url, payload, ListsInterestCategoriesInterestResponse.class);
    }

    /**
     * Get all interests in a specific category
     *
     * @param listId             The unique id for the list.
     * @param interestCategoryId The unique id for the interest category.
     * @param request            Query string parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsInterestCategoriesInterestReadResponse> readInterest(String listId, String interestCategoryId, ListsInterestCategoriesReadRequest request) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId + "/interests";
        url = MailchimpUtils.formatQueryString(url, "fields", request.getFields());
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", request.getExcludeFields());
        url = MailchimpUtils.formatQueryString(url, "count", request.getCount());
        url = MailchimpUtils.formatQueryString(url, "offset", request.getOffset());
        return builder.get(url, ListsInterestCategoriesInterestReadResponse.class);
    }

    /**
     * Get interests in a specific category
     *
     * @param listId             The unique id for the list.
     * @param interestCategoryId The unique id for the interest category.tegoryId
     * @param interestId         The specific interest or ‘group name’.
     * @param fields             A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
     * @param excludeFields      A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsInterestCategoriesInterestResponse> readInterest(String listId, String interestCategoryId, String interestId, String fields, String excludeFields) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        if (StringUtils.isBlank(interestId)) {
            throw new MailchimpException("The field interest_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId + "/interests/" + interestId;
        url = MailchimpUtils.formatQueryString(url, "fields", fields);
        url = MailchimpUtils.formatQueryString(url, "exclude_fields", excludeFields);

        return builder.get(url, ListsInterestCategoriesInterestResponse.class);
    }

    /**
     * Update interests in a specific category
     *
     * @param listId             The unique id for the list.
     * @param interestCategoryId The unique id for the interest category.tegoryId
     * @param interestId         The specific interest or ‘group name’.
     * @param request            Request body parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsInterestCategoriesInterestResponse> editInterest(String listId, String interestCategoryId, String interestId, ListsInterestCategoriesInterestRequest request) throws MailchimpException {

        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        if (StringUtils.isBlank(interestId)) {
            throw new MailchimpException("The field interest_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId + "/interests/" + interestId;
        String payload = GSON.toJson(request);
        return builder.patch(url, payload, ListsInterestCategoriesInterestResponse.class);
    }

    /**
     * Delete interests in a specific category
     *
     * @param listId             The unique id for the list.
     * @param interestCategoryId The unique id for the interest category.tegoryId
     * @param interestId         The specific interest or ‘group name’.
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> deleteInterest(String listId, String interestCategoryId, String interestId) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field campaign_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        if (StringUtils.isBlank(interestId)) {
            throw new MailchimpException("The field interest_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId + "/interests/" + interestId;
        return builder.delete(url, Void.class);
    }
}
