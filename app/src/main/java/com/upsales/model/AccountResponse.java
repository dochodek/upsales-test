
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AccountResponse implements Serializable {

    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("data")
    @Expose
    private DataAccount dataAccount;

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public DataAccount getDataAccount() {
        return dataAccount;
    }

    public void setDataAccount(DataAccount dataAccount) {
        this.dataAccount = dataAccount;
    }

}
