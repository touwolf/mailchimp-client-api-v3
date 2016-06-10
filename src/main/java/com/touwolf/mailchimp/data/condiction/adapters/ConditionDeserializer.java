package com.touwolf.mailchimp.data.condiction.adapters;

import com.google.gson.*;
import com.touwolf.mailchimp.data.condiction.MailchimpConditionType;
import com.touwolf.mailchimp.data.condiction.MailchimpConditions;
import com.touwolf.mailchimp.data.condiction.types.*;

import java.lang.reflect.Type;
import java.util.Map;

public class ConditionDeserializer implements JsonDeserializer<MailchimpConditions> {
    private static final Gson GSON = new GsonBuilder().create();

    @Override
    public MailchimpConditions deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            if ("condition_type".equals(key)) {
                String componentType = entry.getValue().getAsString();
                switch (componentType) {
                    case "Aim": {
                        return create(jsonElement, McAim.class, MailchimpConditionType.AIM);
                    }
                    case "Automation": {
                        return create(jsonElement, McAutomation.class, MailchimpConditionType.AUTOMATION);
                    }
                    case "CampaignPoll": {
                        return create(jsonElement, McCampaignPoll.class, MailchimpConditionType.CAMPAIGN_POLL);
                    }
                    case "Conversation": {
                        return create(jsonElement, McConversation.class, MailchimpConditionType.CONVERSATION);
                    }
                    case "Date": {
                        return create(jsonElement, McDate.class, MailchimpConditionType.DATE);
                    }
                    case "EmailClient": {
                        return create(jsonElement, McEmailClient.class, MailchimpConditionType.EMAIL_CLIENT);
                    }
                    case "Language": {
                        return create(jsonElement, McLanguage.class, MailchimpConditionType.LANGUAGE);
                    }
                    case "Mandrill": {
                        return create(jsonElement, McMandrill.class, MailchimpConditionType.MANDRILL);
                    }
                    case "MemberRating": {
                        return create(jsonElement, McMemberRating.class, MailchimpConditionType.MEMBER_RATING);
                    }
                    case "SignupSource": {
                        return create(jsonElement, McSignupSource.class, MailchimpConditionType.SIGNUP_SOURCE);
                    }
                    case "SurveyMonkey": {
                        return create(jsonElement, McSurveyMonkey.class, MailchimpConditionType.SURVEY_MONKEY);
                    }
                    case "VIP": {
                        return create(jsonElement, McVip.class, MailchimpConditionType.VIP);
                    }
                    case "Interests": {
                        return create(jsonElement, McInterests.class, MailchimpConditionType.INTERESTS);
                    }
                    case "EcommCategory": {
                        return create(jsonElement, McEcommCategory.class, MailchimpConditionType.ECOMM_CATEGORY);
                    }
                    case "EcommNumber": {
                        return create(jsonElement, McEcommNumber.class, MailchimpConditionType.ECOMM_NUMBER);
                    }
                    case "EcommPurchased": {
                        return create(jsonElement, McEcommPurchased.class, MailchimpConditionType.ECOMM_PURCHASED);
                    }
                    case "EcommSpent": {
                        return create(jsonElement, McEcommSpent.class, MailchimpConditionType.ECOMM_SPENT);
                    }
                    case "EcommStore": {
                        return create(jsonElement, McEcommStore.class, MailchimpConditionType.ECOMM_STORE);
                    }
                    case "GoalActivity": {
                        return create(jsonElement, McGoalActivity.class, MailchimpConditionType.GOAL_ACTIVITY);
                    }
                    case "GoalTimestamp": {
                        return create(jsonElement, McGoalTimestamp.class, MailchimpConditionType.GOAL_TIMESTAMP);
                    }
                    case "FuzzySegment": {
                        return create(jsonElement, McFuzzySegment.class, MailchimpConditionType.FUZZY_SEGMENT);
                    }
                    case "StaticSegment": {
                        return create(jsonElement, McStaticSegment.class, MailchimpConditionType.STATIC_SEGMENT);
                    }
                    case "IPGeoCountryState": {
                        return create(jsonElement, McIPGeoCountryState.class, MailchimpConditionType.IP_GEO_COUNTRY_STATE);
                    }
                    case "IPGeoIn": {
                        return create(jsonElement, McIPGeoIn.class, MailchimpConditionType.IP_GEO_IN);
                    }
                    case "IPGeoInZip": {
                        return create(jsonElement, McIPGeoInZip.class, MailchimpConditionType.IP_GEO_IN_ZIP);
                    }
                    case "IPGeoUnknown": {
                        return create(jsonElement, McIPGeoUnknown.class, MailchimpConditionType.IP_GEO_UNKNOWN);
                    }
                    case "IPGeoZip": {
                        return create(jsonElement, McIPGeoZip.class, MailchimpConditionType.IP_GEO_ZIP);
                    }
                    case "SocialAge": {
                        return create(jsonElement, McSocialAge.class, MailchimpConditionType.SOCIAL_AGE);
                    }
                    case "SocialGender": {
                        return create(jsonElement, McSocialGender.class, MailchimpConditionType.SOCIAL_GENDER);
                    }
                    case "SocialInfluence": {
                        return create(jsonElement, McSocialInfluence.class, MailchimpConditionType.SOCIAL_INFLUENCE);
                    }
                    case "SocialNetworkMember": {
                        return create(jsonElement, McSocialNetworkMember.class, MailchimpConditionType.SOCIAL_NETWORK_MEMBER);
                    }
                    case "SocialNetworkFollow": {
                        return create(jsonElement, McSocialNetworkFollow.class, MailchimpConditionType.SOCIAL_NETWORK_FOLLOW);
                    }
                    case "AddressMerge": {
                        return create(jsonElement, McAddressMerge.class, MailchimpConditionType.ADDRESS_MERGE);
                    }
                    case "ZipMerge": {
                        return create(jsonElement, McZipMerge.class, MailchimpConditionType.ZIP_MERGE);
                    }
                    case "BirthdayMerge": {
                        return create(jsonElement, McBirthdayMerge.class, MailchimpConditionType.BIRTHDAY_MERGE);
                    }
                    case "DateMerge": {
                        return create(jsonElement, McDateMerge.class, MailchimpConditionType.DATE_MERGE);
                    }
                    case "TextMerge": {
                        return create(jsonElement, McTextMerge.class, MailchimpConditionType.TEXT_MERGE);
                    }
                    case "SelectMerge": {
                        return create(jsonElement, McSelectMerge.class, MailchimpConditionType.SELECT_MERGE);
                    }
                    case "EmailAddress": {
                        return create(jsonElement, McEmailAddress.class, MailchimpConditionType.EMAIL_ADDRESS);
                    }
                    default:
                        break;
                }
            }
        }

        return null;
    }

    private <T extends McParent> MailchimpConditions<T> create(JsonElement jsonElement, Class<T> c, MailchimpConditionType type) {
        MailchimpConditions<T> mailchimpConditions = new MailchimpConditions<>();

        T condiction = GSON.fromJson(jsonElement, c);
        condiction.setConditionType(type);

        mailchimpConditions.setCondition(condiction);
        return mailchimpConditions;
    }
}
