package com.touwolf.mailchimp.data.condiction.types;

import java.util.List;

public class McInterests extends McParent {
    private McInterestsOpEnum op;

    private String field;

    private List<Integer> value;

    /**
     * Whether the member is a part of one, all, or none of the groups.
     * Possible Values:
     * <p>
     * interestcontains
     * interestcontainsall
     * interestnotcontains
     */
    public McInterestsOpEnum getOp() {
        return op;
    }

    public void setOp(McInterestsOpEnum op) {
        this.op = op;
    }

    /**
     * The interest group, like “interests-123”
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    /**
     * An array containing integers, each representing a group id.
     */
    public List<Integer> getValue() {
        return value;
    }

    public void setValue(List<Integer> value) {
        this.value = value;
    }
}
