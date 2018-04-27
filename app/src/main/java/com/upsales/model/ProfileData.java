
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProfileData implements Serializable {

    @SerializedName("employeesQuantityExactNumber")
    @Expose
    private Long employeesQuantityExactNumber;
    @SerializedName("employeesQuantityFinancialStatement1")
    @Expose
    private Long employeesQuantityFinancialStatement1;
    @SerializedName("employeesQuantityFinancialStatement2")
    @Expose
    private Long employeesQuantityFinancialStatement2;
    @SerializedName("employeesQuantityFinancialStatement3")
    @Expose
    private Long employeesQuantityFinancialStatement3;
    @SerializedName("employeesQuantityFinancialStatement4")
    @Expose
    private Long employeesQuantityFinancialStatement4;
    @SerializedName("employeesQuantityFinancialStatement5")
    @Expose
    private Long employeesQuantityFinancialStatement5;
    @SerializedName("primaryLineOfBusinessText")
    @Expose
    private String primaryLineOfBusinessText;
    @SerializedName("primaryLineOfBusinessCode")
    @Expose
    private String primaryLineOfBusinessCode;
    @SerializedName("sicText")
    @Expose
    private String sicText;
    @SerializedName("sictCode")
    @Expose
    private String sictCode;
    @SerializedName("bisnodeBranch")
    @Expose
    private String bisnodeBranch;
    @SerializedName("groupRelationshipCode")
    @Expose
    private Long groupRelationshipCode;
    @SerializedName("groupRelationship")
    @Expose
    private String groupRelationship;
    @SerializedName("ultimateParentCompanyDunsNumber")
    @Expose
    private Object ultimateParentCompanyDunsNumber;
    @SerializedName("ultimateParentCompanyRegistrationNumber")
    @Expose
    private Object ultimateParentCompanyRegistrationNumber;
    @SerializedName("ultimateParentCompanyName")
    @Expose
    private String ultimateParentCompanyName;
    @SerializedName("ultimateParentCompanyCountryCode")
    @Expose
    private String ultimateParentCompanyCountryCode;
    @SerializedName("parentCompanyDunsNumber")
    @Expose
    private Object parentCompanyDunsNumber;
    @SerializedName("parentCompanyCountryRegistrationNumber")
    @Expose
    private Object parentCompanyCountryRegistrationNumber;
    @SerializedName("parentCompanyName")
    @Expose
    private String parentCompanyName;
    @SerializedName("parentCompanyCountryCode")
    @Expose
    private String parentCompanyCountryCode;
    @SerializedName("groupEmployeesQuantity")
    @Expose
    private Long groupEmployeesQuantity;

    public Long getEmployeesQuantityExactNumber() {
        return employeesQuantityExactNumber;
    }

    public void setEmployeesQuantityExactNumber(Long employeesQuantityExactNumber) {
        this.employeesQuantityExactNumber = employeesQuantityExactNumber;
    }

    public Long getEmployeesQuantityFinancialStatement1() {
        return employeesQuantityFinancialStatement1;
    }

    public void setEmployeesQuantityFinancialStatement1(Long employeesQuantityFinancialStatement1) {
        this.employeesQuantityFinancialStatement1 = employeesQuantityFinancialStatement1;
    }

    public Long getEmployeesQuantityFinancialStatement2() {
        return employeesQuantityFinancialStatement2;
    }

    public void setEmployeesQuantityFinancialStatement2(Long employeesQuantityFinancialStatement2) {
        this.employeesQuantityFinancialStatement2 = employeesQuantityFinancialStatement2;
    }

    public Long getEmployeesQuantityFinancialStatement3() {
        return employeesQuantityFinancialStatement3;
    }

    public void setEmployeesQuantityFinancialStatement3(Long employeesQuantityFinancialStatement3) {
        this.employeesQuantityFinancialStatement3 = employeesQuantityFinancialStatement3;
    }

    public Long getEmployeesQuantityFinancialStatement4() {
        return employeesQuantityFinancialStatement4;
    }

    public void setEmployeesQuantityFinancialStatement4(Long employeesQuantityFinancialStatement4) {
        this.employeesQuantityFinancialStatement4 = employeesQuantityFinancialStatement4;
    }

    public Long getEmployeesQuantityFinancialStatement5() {
        return employeesQuantityFinancialStatement5;
    }

    public void setEmployeesQuantityFinancialStatement5(Long employeesQuantityFinancialStatement5) {
        this.employeesQuantityFinancialStatement5 = employeesQuantityFinancialStatement5;
    }

    public String getPrimaryLineOfBusinessText() {
        return primaryLineOfBusinessText;
    }

    public void setPrimaryLineOfBusinessText(String primaryLineOfBusinessText) {
        this.primaryLineOfBusinessText = primaryLineOfBusinessText;
    }

    public String getPrimaryLineOfBusinessCode() {
        return primaryLineOfBusinessCode;
    }

    public void setPrimaryLineOfBusinessCode(String primaryLineOfBusinessCode) {
        this.primaryLineOfBusinessCode = primaryLineOfBusinessCode;
    }

    public String getSicText() {
        return sicText;
    }

    public void setSicText(String sicText) {
        this.sicText = sicText;
    }

    public String getSictCode() {
        return sictCode;
    }

    public void setSictCode(String sictCode) {
        this.sictCode = sictCode;
    }

    public String getBisnodeBranch() {
        return bisnodeBranch;
    }

    public void setBisnodeBranch(String bisnodeBranch) {
        this.bisnodeBranch = bisnodeBranch;
    }

    public Long getGroupRelationshipCode() {
        return groupRelationshipCode;
    }

    public void setGroupRelationshipCode(Long groupRelationshipCode) {
        this.groupRelationshipCode = groupRelationshipCode;
    }

    public String getGroupRelationship() {
        return groupRelationship;
    }

    public void setGroupRelationship(String groupRelationship) {
        this.groupRelationship = groupRelationship;
    }

    public Object getUltimateParentCompanyDunsNumber() {
        return ultimateParentCompanyDunsNumber;
    }

    public void setUltimateParentCompanyDunsNumber(Object ultimateParentCompanyDunsNumber) {
        this.ultimateParentCompanyDunsNumber = ultimateParentCompanyDunsNumber;
    }

    public Object getUltimateParentCompanyRegistrationNumber() {
        return ultimateParentCompanyRegistrationNumber;
    }

    public void setUltimateParentCompanyRegistrationNumber(Object ultimateParentCompanyRegistrationNumber) {
        this.ultimateParentCompanyRegistrationNumber = ultimateParentCompanyRegistrationNumber;
    }

    public String getUltimateParentCompanyName() {
        return ultimateParentCompanyName;
    }

    public void setUltimateParentCompanyName(String ultimateParentCompanyName) {
        this.ultimateParentCompanyName = ultimateParentCompanyName;
    }

    public String getUltimateParentCompanyCountryCode() {
        return ultimateParentCompanyCountryCode;
    }

    public void setUltimateParentCompanyCountryCode(String ultimateParentCompanyCountryCode) {
        this.ultimateParentCompanyCountryCode = ultimateParentCompanyCountryCode;
    }

    public Object getParentCompanyDunsNumber() {
        return parentCompanyDunsNumber;
    }

    public void setParentCompanyDunsNumber(Object parentCompanyDunsNumber) {
        this.parentCompanyDunsNumber = parentCompanyDunsNumber;
    }

    public Object getParentCompanyCountryRegistrationNumber() {
        return parentCompanyCountryRegistrationNumber;
    }

    public void setParentCompanyCountryRegistrationNumber(Object parentCompanyCountryRegistrationNumber) {
        this.parentCompanyCountryRegistrationNumber = parentCompanyCountryRegistrationNumber;
    }

    public String getParentCompanyName() {
        return parentCompanyName;
    }

    public void setParentCompanyName(String parentCompanyName) {
        this.parentCompanyName = parentCompanyName;
    }

    public String getParentCompanyCountryCode() {
        return parentCompanyCountryCode;
    }

    public void setParentCompanyCountryCode(String parentCompanyCountryCode) {
        this.parentCompanyCountryCode = parentCompanyCountryCode;
    }

    public Long getGroupEmployeesQuantity() {
        return groupEmployeesQuantity;
    }

    public void setGroupEmployeesQuantity(Long groupEmployeesQuantity) {
        this.groupEmployeesQuantity = groupEmployeesQuantity;
    }

}
