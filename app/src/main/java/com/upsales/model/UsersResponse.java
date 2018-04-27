
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class UsersResponse implements Serializable {

    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("data")
    @Expose
    private List<DataUsers> data = null;

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

    public List<DataUsers> getData() {
        return data;
    }

    public void setData(List<DataUsers> data) {
        this.data = data;
    }

}
