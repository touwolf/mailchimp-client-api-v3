package com.touwolf.mailchimp.model.list.segments;

import com.google.gson.annotations.SerializedName;

public class ListsSegmentsRequest {
    private String name;

    @SerializedName("static_segment")
    private String[] staticSegment;

    private ListsSegmentsOptions options;

    /**
     * The name of the segment.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * An array of emails to be used for a static segment. Any emails provided that are not present on the list will be ignored.
     * Passing an empty array will create a static segment without any subscribers.
     * This field cannot be provided with the options field.
     */
    public String[] getStaticSegment() {
        return staticSegment;
    }

    public void setStaticSegment(String[] staticSegment) {
        this.staticSegment = staticSegment;
    }

    /**
     * The conditions of the segment. Static and fuzzy segments don’t have conditions.
     */
    public ListsSegmentsOptions getOptions() {
        return options;
    }

    public void setOptions(ListsSegmentsOptions options) {
        this.options = options;
    }
}