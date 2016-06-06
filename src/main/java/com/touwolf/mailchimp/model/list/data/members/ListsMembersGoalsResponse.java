package com.touwolf.mailchimp.model.list.data.members;

import com.google.gson.annotations.SerializedName;

public class ListsMembersGoalsResponse
{
    @SerializedName("goal_id")
    private Integer goalId;

    private String event;

    @SerializedName("last_visited_at")
    private String lastVisitedAt;

    private String data;

    /**
     * The id for a Goal event.
     *
     */
    public Integer getGoalId() {
        return goalId;
    }

    public void setGoalId(Integer goalId) {
        this.goalId = goalId;
    }

    /**
     * The name/type of Goal event triggered
     *
     */
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * The date and time the user last triggered the Goal event.
     *
     */
    public String getLastVisitedAt() {
        return lastVisitedAt;
    }

    public void setLastVisitedAt(String lastVisitedAt) {
        this.lastVisitedAt = lastVisitedAt;
    }

    /**
     * Any extra data passed with the Goal event.
     *
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
