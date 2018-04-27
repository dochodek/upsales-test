
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Soliditet implements Serializable{

    @SerializedName("generalData")
    @Expose
    private GeneralData generalData;
    @SerializedName("profileData")
    @Expose
    private ProfileData profileData;
    @SerializedName("peopleData")
    @Expose
    private PeopleData peopleData;
    @SerializedName("financialData")
    @Expose
    private FinancialData financialData;

    public GeneralData getGeneralData() {
        return generalData;
    }

    public void setGeneralData(GeneralData generalData) {
        this.generalData = generalData;
    }

    public ProfileData getProfileData() {
        return profileData;
    }

    public void setProfileData(ProfileData profileData) {
        this.profileData = profileData;
    }

    public PeopleData getPeopleData() {
        return peopleData;
    }

    public void setPeopleData(PeopleData peopleData) {
        this.peopleData = peopleData;
    }

    public FinancialData getFinancialData() {
        return financialData;
    }

    public void setFinancialData(FinancialData financialData) {
        this.financialData = financialData;
    }

}
