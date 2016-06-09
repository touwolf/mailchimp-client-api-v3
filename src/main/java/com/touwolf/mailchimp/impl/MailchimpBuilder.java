package com.touwolf.mailchimp.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.touwolf.mailchimp.MailchimpException;
import com.touwolf.mailchimp.data.MailchimpErrors;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.data.condiction.MailchimpConditions;
import com.touwolf.mailchimp.data.condiction.adapters.ConditionDeserializer;
import com.touwolf.mailchimp.data.condiction.adapters.ConditionSerializer;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MailchimpBuilder {
    private static final Logger logger = LoggerFactory.getLogger(MailchimpBuilder.class);

    private final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(MailchimpConditions.class, new ConditionDeserializer())
            .registerTypeAdapter(MailchimpConditions.class, new ConditionSerializer())
            .setPrettyPrinting()
            .setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private final String basicAuth;

    private final String urlBase;

    private OkHttpClient client;

    public MailchimpBuilder(String urlBase, String apiUser, String apiKey, Integer timeout) {
        this.urlBase = urlBase;

        this.basicAuth = Credentials.basic(apiUser, apiKey);
        this.client = new OkHttpClient()
                .newBuilder()
                .readTimeout(timeout, TimeUnit.SECONDS)
                .build();
    }

    /**
     * Retrieve a resource or group of resouces
     *
     * @param url
     * @param clazzResp
     * @param <T>
     * @return The response
     * @throws MailchimpException
     */
    public <T> MailchimpResponse<T> get(String url, Class<T> clazzResp) throws MailchimpException {
        return send(url, null, "GET", clazzResp);
    }

    /**
     * Create a new resource
     *
     * @param url
     * @param payload
     * @param clazzResp
     * @param <T>
     * @return The response
     * @throws MailchimpException
     */
    public <T> MailchimpResponse<T> post(String url, String payload, Class<T> clazzResp) throws MailchimpException {
        return send(url, payload, "POST", clazzResp);
    }

    /**
     * Create a new resource
     *
     * @param url
     * @param clazzResp
     * @param <T>
     * @return The response
     * @throws MailchimpException
     */
    public <T> MailchimpResponse<T> post(String url, Class<T> clazzResp) throws MailchimpException {
        return send(url, "", "POST", clazzResp);
    }

    /**
     * Update an existing resource
     *
     * @param url
     * @param payload
     * @param clazzResp
     * @param <T>
     * @return The response
     * @throws MailchimpException
     */
    public <T> MailchimpResponse<T> put(String url, String payload, Class<T> clazzResp) throws MailchimpException {
        return send(url, payload, "PUT", clazzResp);
    }

    /**
     * Update an existing resource
     *
     * @param url
     * @param payload
     * @param clazzResp
     * @param <T>
     * @return The response
     * @throws MailchimpException
     */
    public <T> MailchimpResponse<T> patch(String url, String payload, Class<T> clazzResp) throws MailchimpException {
        return send(url, payload, "PATCH", clazzResp);
    }

    /**
     * Delete an existing resource
     *
     * @param url
     * @param clazzResp
     * @param <T>
     * @return The response
     * @throws MailchimpException
     */
    public <T> MailchimpResponse<T> delete(String url, Class<T> clazzResp) throws MailchimpException {
        return send(url, null, "DELETE", clazzResp);
    }

    /**
     * Delete an existing resource
     *
     * @param url
     * @param payload
     * @param clazzResp
     * @param <T>
     * @return The response
     * @throws MailchimpException
     */
    public <T> MailchimpResponse<T> delete(String url, String payload, Class<T> clazzResp) throws MailchimpException {
        return send(url, payload, "DELETE", clazzResp);
    }

    private <T> MailchimpResponse<T> send(String url, String payload, String verb, Class<T> clazzResp) throws MailchimpException {
        try {
            RequestBody body = null;
            if (null != payload) {
                body = RequestBody.create(JSON, payload);
            }

            Request.Builder builder = new Request.Builder()
                    .header("Accept", "application/json")
                    .header("Authorization", basicAuth)
                    .url(urlBase + url);

            Request request = null;
            switch (verb) {
                case "GET": {
                    request = builder.get().build();
                    break;
                }

                case "POST": {
                    request = builder.post(body).build();
                    break;
                }

                case "PATCH": {
                    request = builder.patch(body).build();
                    break;
                }

                case "DELETE": {
                    request = null == body ? builder.delete().build() : builder.delete(body).build();
                    break;
                }

                case "PUT": {
                    request = builder.put(body).build();
                    break;
                }
            }

            Response response = client.newCall(request).execute();
            String result = response.body().string();

            if (response.code() != 200) {
                throw new MailchimpException(GSON.fromJson(result, MailchimpErrors.class), response.code());
            }

            MailchimpResponse<T> MailchimpResponse = new MailchimpResponse<>(url, payload, result);
            MailchimpResponse.setData(GSON.fromJson(result, clazzResp));
            MailchimpResponse.setCode(response.code());

            return MailchimpResponse;
        } catch (IOException ex) {
            throw new MailchimpException(ex.getMessage());
        }
    }
}