package com.touwolf.mailchimp.api.lists;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpBuilder;
import com.touwolf.mailchimp.model.list.webhooks.ListsWebhooksReadResponse;
import com.touwolf.mailchimp.model.list.webhooks.ListsWebhooksRequest;
import com.touwolf.mailchimp.model.list.webhooks.ListsWebhooksResponse;
import org.apache.commons.lang.StringUtils;
import org.bridje.ioc.Component;

/**
 * Manage webhooks for a specific MailChimp list.
 */
@Component
public class ListsWebhooks {
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private MailchimpBuilder builder;

    public ListsWebhooks builder(MailchimpBuilder builder) {
        this.builder = builder;
        return this;
    }

    /**
     * Create a new webhook
     *
     * @param listId  The unique id for the list.
     * @param request Response body parameters
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsWebhooksResponse> create(String listId, ListsWebhooksRequest request) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/webhooks";
        String payload = GSON.toJson(request);
        return builder.post(url, payload, ListsWebhooksResponse.class);
    }

    /**
     * Get information about all webhooks for a specific list
     *
     * @param listId The unique id for the list.
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsWebhooksReadResponse> read(String listId) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        String url = "/lists/" + listId + "/webhooks";
        return builder.get(url, ListsWebhooksReadResponse.class);
    }

    /**
     * Get information about a specific webhook
     *
     * @param listId    The unique id for the list.
     * @param webhookId The unique id for the webhook.
     * @throws MailchimpException
     */
    public MailchimpResponse<ListsWebhooksResponse> read(String listId, String webhookId) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(webhookId)) {
            throw new MailchimpException("The field webhook_id is required");
        }

        String url = "/lists/" + listId + "/webhooks/" + webhookId;
        return builder.get(url, ListsWebhooksResponse.class);
    }

    /**
     * Delete a webhook
     *
     * @param listId    The unique id for the list.
     * @param webhookId The unique id for the webhook
     * @throws MailchimpException
     */
    public MailchimpResponse<Void> delete(String listId, String webhookId) throws MailchimpException {
        if (StringUtils.isBlank(listId)) {
            throw new MailchimpException("The field list_id is required");
        }

        if (StringUtils.isBlank(webhookId)) {
            throw new MailchimpException("The field webhook_id is required");
        }

        String url = "/lists/" + listId + "/webhooks/" + webhookId;
        return builder.delete(url, Void.class);
    }
}
