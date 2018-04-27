
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class AccountsResponse implements Serializable {

    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("data")
    @Expose
    private List<DataAccounts> data = null;

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<DataAccounts> getData() {
        return data;
    }

    public void setData(List<DataAccounts> data) {
        this.data = data;
    }

}
