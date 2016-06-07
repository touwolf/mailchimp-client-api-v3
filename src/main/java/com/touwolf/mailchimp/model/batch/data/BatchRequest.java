package com.touwolf.mailchimp.model.batch.data;

public class BatchRequest
{
    private String method;

    private String path;

    private String params;

    private String body;

    private String operationId;

    /**
     * The HTTP method to use for the operation.
     * Possible Values:

     * GET
     * POST
     * PUT
     * PATCH
     *
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * The relative path to use for the operation.
     *
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Any URL params to use, only applies to GET operations.
     *
     */
    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    /**
     * A string containing the JSON body to use with the request.
     *
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * An optional client-supplied id returned with the operation results.
     *
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }
}
