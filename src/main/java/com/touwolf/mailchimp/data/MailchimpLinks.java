package com.touwolf.mailchimp.data;

public class MailchimpLinks
{
    private String rel;

    private String href;

    private MailchimpLinksMethod method;

    private String targetSchema;

    private String schema;

    /**
     * As with an HTML ‘rel’ attribute, this describes the type of link.
     *
     */
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    /**
     * This property contains a fully-qualified URL that can be called to retrieve the linked resource or perform the linked action.
     *
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /**
     * The HTTP method that should be used when accessing the URL defined in ‘href'
     *
     * Possible Values:
     *
     * GET
     * POST
     * PUT
     * PATCH
     * DELETE
     * OPTIONS
     * HEAD
     *
     */
    public MailchimpLinksMethod getMethod() {
        return method;
    }

    public void setMethod(MailchimpLinksMethod method) {
        this.method = method;
    }

    /**
     * For GETs, this is a URL representing the schema that the response should conform to.
     *
     */
    public String getTargetSchema() {
        return targetSchema;
    }

    public void setTargetSchema(String targetSchema) {
        this.targetSchema = targetSchema;
    }

    /**
     * For HTTP methods that can receive bodies (POST and PUT), this is a URL representing the schema that the body should conform to.
     *
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
