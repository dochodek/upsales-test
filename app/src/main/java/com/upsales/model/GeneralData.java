
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GeneralData implements Serializable {

    @SerializedName("countryRegistrationNumber")
    @Expose
    private Long countryRegistrationNumber;
    @SerializedName("cfarNumber")
    @Expose
    private Long cfarNumber;
    @SerializedName("conditionCode")
    @Expose
    private String conditionCode;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("brancheCompanyName")
    @Expose
    private String brancheCompanyName;
    @SerializedName("registeredCompanyName")
    @Expose
    private String registeredCompanyName;
    @SerializedName("postalAddress")
    @Expose
    private String postalAddress;
    @SerializedName("postalCode")
    @Expose
    private Integer postalCode;
    @SerializedName("townName")
    @Expose
    private String townName;
    @SerializedName("visitingAddress")
    @Expose
    private String visitingAddress;
    @SerializedName("visitingAddressPostalCode")
    @Expose
    private Integer visitingAddressPostalCode;
    @SerializedName("visitingAddressTownName")
    @Expose
    private String visitingAddressTownName;
    @SerializedName("telephoneNumber")
    @Expose
    private String telephoneNumber;
    @SerializedName("homepageUrl")
    @Expose
    private String homepageUrl;
    @SerializedName("municipalityName")
    @Expose
    private String municipalityName;
    @SerializedName("countyName")
    @Expose
    private Object countyName;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("headquarterOrBranch")
    @Expose
    private String headquarterOrBranch;
    @SerializedName("directMarketingBlockCode")
    @Expose
    private String directMarketingBlockCode;

    public Long getCountryRegistrationNumber() {
        return countryRegistrationNumber;
    }

    public void setCountryRegistrationNumber(Long countryRegistrationNumber) {
        this.countryRegistrationNumber = countryRegistrationNumber;
    }

    public Long getCfarNumber() {
        return cfarNumber;
    }

    public void setCfarNumber(Long cfarNumber) {
        this.cfarNumber = cfarNumber;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBrancheCompanyName() {
        return brancheCompanyName;
    }

    public void setBrancheCompanyName(String brancheCompanyName) {
        this.brancheCompanyName = brancheCompanyName;
    }

    public String getRegisteredCompanyName() {
        return registeredCompanyName;
    }

    public void setRegisteredCompanyName(String registeredCompanyName) {
        this.registeredCompanyName = registeredCompanyName;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getVisitingAddress() {
        return visitingAddress;
    }

    public void setVisitingAddress(String visitingAddress) {
        this.visitingAddress = visitingAddress;
    }

    public Integer getVisitingAddressPostalCode() {
        return visitingAddressPostalCode;
    }

    public void setVisitingAddressPostalCode(Integer visitingAddressPostalCode) {
        this.visitingAddressPostalCode = visitingAddressPostalCode;
    }

    public String getVisitingAddressTownName() {
        return visitingAddressTownName;
    }

    public void setVisitingAddressTownName(String visitingAddressTownName) {
        this.visitingAddressTownName = visitingAddressTownName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
    }

    public Object getCountyName() {
        return countyName;
    }

    public void setCountyName(Object countyName) {
        this.countyName = countyName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getHeadquarterOrBranch() {
        return headquarterOrBranch;
    }

    public void setHeadquarterOrBranch(String headquarterOrBranch) {
        this.headquarterOrBranch = headquarterOrBranch;
    }

    public String getDirectMarketingBlockCode() {
        return directMarketingBlockCode;
    }

    public void setDirectMarketingBlockCode(String directMarketingBlockCode) {
        this.directMarketingBlockCode = directMarketingBlockCode;
    }

}
