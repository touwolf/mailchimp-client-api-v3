package com.touwolf.mailchimp.model.campaign.content;

class CampaignContentTemplate {
    private Integer id;

    private String sections;

    /**
     * The id of the template to use.
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Content for the sections of the template. Each key should be the unique mc:edit area name from the template.
     */
    public String getSections() {
        return sections;
    }

    public void setSections(String sections) {
        this.sections = sections;
    }
}
