package com.touwolf.mailchimp.model.batch.data;

public class BatchCreateRequest
{
    private BatchRequest[] operations;

    /**
     * An array of objects that describes operations to perform.
     *
     */
    public BatchRequest[] getOperations() {
        return operations;
    }

    public void setOperations(BatchRequest[] operations) {
        this.operations = operations;
    }
}
