package com.touwolf.mailchimp.data.condiction.adapters;


import com.google.gson.*;
import com.touwolf.mailchimp.data.condiction.MailchimpConditions;

import java.lang.reflect.Type;

public class ConditionSerializer implements JsonSerializer<MailchimpConditions> {
    private static final Gson GSON = new GsonBuilder().create();

    @Override
    public JsonElement serialize(MailchimpConditions mailchimpConditions, Type type, JsonSerializationContext jsonSerializationContext) {
        return GSON.toJsonTree(mailchimpConditions.getCondition());
    }
}
