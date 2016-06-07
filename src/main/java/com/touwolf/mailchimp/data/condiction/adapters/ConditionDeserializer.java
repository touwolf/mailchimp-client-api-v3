package com.touwolf.mailchimp.data.condiction.adapters;

import com.google.gson.*;
import com.touwolf.mailchimp.data.condiction.MailchimpConditionType;
import com.touwolf.mailchimp.data.condiction.MailchimpConditions;
import com.touwolf.mailchimp.data.condiction.types.McEmailClient;

import java.lang.reflect.Type;
import java.util.Map;

public class ConditionDeserializer implements JsonDeserializer<MailchimpConditions>
{
    private static final Gson GSON = new GsonBuilder().create();

    @Override
    public MailchimpConditions deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException
    {
        for (Map.Entry<String,JsonElement> entry : jsonElement.getAsJsonObject().entrySet())
        {
            String key = entry.getKey();
            if(key.equals("condition_type"))
            {
                String componentType = entry.getValue().getAsString();
                switch (componentType)
                {
                    case "EmailClient":
                    {
                        MailchimpConditions<McEmailClient> condition = new MailchimpConditions<>();

                        McEmailClient emailClient = GSON.fromJson(jsonElement, McEmailClient.class);
                        emailClient.setConditionType(MailchimpConditionType.EMAIL_CLIENT);
                        condition.setCondition(emailClient);

                        return condition;
                    }

                }
            }
        }

        return null;
    }
}
