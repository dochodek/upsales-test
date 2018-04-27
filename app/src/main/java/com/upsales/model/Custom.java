
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Custom implements Serializable {

    @SerializedName("valueDouble")
    @Expose
    private Long valueDouble;
    @SerializedName("valueInteger")
    @Expose
    private Long valueInteger;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("fieldId")
    @Expose
    private Integer fieldId;

    public Long getValueDouble() {
        return valueDouble;
    }

    public void setValueDouble(Long valueDouble) {
        this.valueDouble = valueDouble;
    }

    public Long getValueInteger() {
        return valueInteger;
    }

    public void setValueInteger(Long valueInteger) {
        this.valueInteger = valueInteger;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

}
