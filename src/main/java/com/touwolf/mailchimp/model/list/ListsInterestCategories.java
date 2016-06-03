package com.touwolf.mailchimp.model.list;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.impl.MailchimpUtils;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.list.data.interestcategories.ListsInterestCategoriesReadRequest;
import com.touwolf.mailchimp.model.list.data.interestcategories.ListsInterestCategoriesReadResponse;
import com.touwolf.mailchimp.model.list.data.interestcategories.ListsInterestCategoriesRequest;
import com.touwolf.mailchimp.model.list.data.interestcategories.ListsInterestCategoriesResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

@Component
public class ListsInterestCategories
{
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsInterestCategories builder(MailchimpBuilder builder)
    {
        this.builder = builder;
        return this;
    }

    public MailchimpResponse<ListsInterestCategoriesResponse> create(String listId, ListsInterestCategoriesRequest request) throws MailchimpException
    {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories";
        String payload = GSON.toJson(request);
        return builder.post(url, payload, ListsInterestCategoriesResponse.class);
    }

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

    public MailchimpResponse<Void> delete(String listId, String interestCategoryId) throws MailchimpException
    {
        if(StringUtils.isBlank(listId))
        {
            throw new MailchimpException("The field campaign_id is required");
        }

        if (StringUtils.isBlank(interestCategoryId)) {
            throw new MailchimpException("The field interest_category_id is required");
        }

        String url = "/lists/" + listId + "/interest-categories/" + interestCategoryId;
        return builder.delete(url, Void.class);
    }
}
