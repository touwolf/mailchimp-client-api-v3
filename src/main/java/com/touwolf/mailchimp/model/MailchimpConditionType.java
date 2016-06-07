package com.touwolf.mailchimp.model;

import com.google.gson.annotations.SerializedName;

public enum MailchimpConditionType
{
    @SerializedName("Aim")
    AIM, //Automation Segment - Aim
    @SerializedName("Automation")
    AUTOMATION, // Automation Segment - Automation
    @SerializedName("CampaignPoll")
    CAMPAIGN_POLL, // Poll Activity Segment - CampaignPoll
    @SerializedName("Conversation")
    CONVERSATION, // Automation Segment - Conversation
    @SerializedName("Date")
    DATE, // Date Segment - Date
    @SerializedName("EmailClient")
    EMAIL_CLIENT, // Automation Segment - EmailClient
    @SerializedName("Language")
    LANGUAGE, // Automation Segment - Language
    @SerializedName("Mandrill")
    MANDRILL, // Segment Condition - Mandrill
    @SerializedName("MemberRating")
    MEMBER_RATING, // Member Rating Segment - MemberRating
    @SerializedName("SignupSource")
    SIGNUP_SOURCE, // Signup Source Segment - SignupSource
    @SerializedName("SurveyMonkey")
    SURVEY_MONKEY, //Survey Monkey Segment - SurveyMonkey
    @SerializedName("VIP")
    VIP, // VIP Segment - VIP
    @SerializedName("Interests")
    INTERESTS, // Interests Segment - Interests
    @SerializedName("EcommCategory")
    ECOMM_CATEGORY, // Ecomm Category Segment - EcommCategory
    @SerializedName("EcommNumber")
    ECOMM_NUMBER, // Ecomm Purchased Segment - EcommNumber
    @SerializedName("EcommPurchased")
    ECOMM_PURCHASED, // Ecomm Purchased Segment - EcommPurchased
    @SerializedName("EcommSpent")
    ECOMM_SPENT, // Ecomm Purchase Segment - EcommSpent
    @SerializedName("EcommStore")
    ECOMM_STORE, // Ecomm Purchased Store Segment - EcommStore
    @SerializedName("GoalActivity")
    GOAL_ACTIVITY, // Goal Activity Segment - GoalActivity
    @SerializedName("GoalTimestamp")
    GOAL_TIMESTAMP, // Goal Timestamp Segment - GoalTimestamp
    @SerializedName("FuzzySegment")
    FUZZY_SEGMENT, // Similar Subscribers Segment Member Segment - FuzzySegment
    @SerializedName("StaticSegment")
    STATIC_SEGMENT, // Static Segment Member Segment - StaticSegment
    @SerializedName("IPGeoCountryState")
    IP_GEO_COUNTRY_STATE, // Location-Based Segment - IPGeoCountryState
    @SerializedName("IPGeoIn")
    IP_GEO_IN, // Geolocation Segment - IPGeoIn
    @SerializedName("IPGeoInZip")
    IP_GEO_IN_ZIP, // US Zip Code Segment - IPGeoInZip
    @SerializedName("IPGeoUnknown")
    IP_GEO_UNKNOWN, // Location-Based Segment - IPGeoUnknown
    @SerializedName("IPGeoZip")
    IP_GEO_ZIP, // Location-Based Segment - IPGeoZip
    @SerializedName("SocialAge")
    SOCIAL_AGE, // Social Profiles Age Segment - SocialAge
    @SerializedName("SocialGender")
    SOCIAL_GENDER, // Social Profiles Gender Segment - SocialGender
    @SerializedName("SocialInfluence")
    SOCIAL_INFLUENCE, // Social Profiles Influence Segment - SocialInfluence
    @SerializedName("SocialNetworkMember")
    SOCIAL_NETWORK_MEMBER, // Social Profiles Social Network Segment - SocialNetworkMember
    @SerializedName("SocialNetworkFollow")
    SOCIAL_NETWORK_FOLLOW, // Social Profiles Social Network Follow Segment - SocialNetworkFollow
    @SerializedName("AddressMerge")
    ADDRESS_MERGE, // Address/Zip Merge Field Segment - AddressMerge
    @SerializedName("ZipMerge")
    ZIP_MERGE, // Address/Zip Merge Field Segment - ZipMerge
    @SerializedName("BirthdayMerge")
    BIRTHDAY_MERGE, // Birthday Merge Field Segment - BirthdayMerge
    @SerializedName("DateMerge")
    DATE_MERGE, // Date Merge Field Segment - DateMerge
    @SerializedName("TextMerge")
    TEXT_MERGE, // Text or Number Merge Field Segment - TextMerge
    @SerializedName("SelectMerge")
    SELECT_MERGE, // Dropdown/Radio Merge Field Segment - SelectMerge
    @SerializedName("EmailAddress")
    EMAIL_ADDRESS // Email Segment - EmailAddress
}
