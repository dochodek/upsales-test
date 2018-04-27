
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FinancialData implements Serializable {

    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("turnoverInterval")
    @Expose
    private Integer turnoverInterval;
    @SerializedName("annualReportPeriod1")
    @Expose
    private String annualReportPeriod1;
    @SerializedName("annualReportPeriod2")
    @Expose
    private String annualReportPeriod2;
    @SerializedName("annualReportPeriod3")
    @Expose
    private String annualReportPeriod3;
    @SerializedName("annualReportPeriod4")
    @Expose
    private String annualReportPeriod4;
    @SerializedName("annualReportPeriod5")
    @Expose
    private String annualReportPeriod5;
    @SerializedName("turnover1")
    @Expose
    private Integer turnover1;
    @SerializedName("turnover2")
    @Expose
    private Integer turnover2;
    @SerializedName("turnover3")
    @Expose
    private Integer turnover3;
    @SerializedName("turnover4")
    @Expose
    private Integer turnover4;
    @SerializedName("turnover5")
    @Expose
    private Integer turnover5;
    @SerializedName("resultAfterFinancialItems1")
    @Expose
    private Integer resultAfterFinancialItems1;
    @SerializedName("resultAfterFinancialItems2")
    @Expose
    private Integer resultAfterFinancialItems2;
    @SerializedName("resultAfterFinancialItems3")
    @Expose
    private Integer resultAfterFinancialItems3;
    @SerializedName("resultAfterFinancialItems4")
    @Expose
    private Integer resultAfterFinancialItems4;
    @SerializedName("resultAfterFinancialItems5")
    @Expose
    private Integer resultAfterFinancialItems5;
    @SerializedName("ratingDateLatestChange")
    @Expose
    private String ratingDateLatestChange;
    @SerializedName("claimOnBankruptCompaniesDate")
    @Expose
    private String claimOnBankruptCompaniesDate;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getTurnoverInterval() {
        return turnoverInterval;
    }

    public void setTurnoverInterval(Integer turnoverInterval) {
        this.turnoverInterval = turnoverInterval;
    }

    public String getAnnualReportPeriod1() {
        return annualReportPeriod1;
    }

    public void setAnnualReportPeriod1(String annualReportPeriod1) {
        this.annualReportPeriod1 = annualReportPeriod1;
    }

    public String getAnnualReportPeriod2() {
        return annualReportPeriod2;
    }

    public void setAnnualReportPeriod2(String annualReportPeriod2) {
        this.annualReportPeriod2 = annualReportPeriod2;
    }

    public String getAnnualReportPeriod3() {
        return annualReportPeriod3;
    }

    public void setAnnualReportPeriod3(String annualReportPeriod3) {
        this.annualReportPeriod3 = annualReportPeriod3;
    }

    public String getAnnualReportPeriod4() {
        return annualReportPeriod4;
    }

    public void setAnnualReportPeriod4(String annualReportPeriod4) {
        this.annualReportPeriod4 = annualReportPeriod4;
    }

    public String getAnnualReportPeriod5() {
        return annualReportPeriod5;
    }

    public void setAnnualReportPeriod5(String annualReportPeriod5) {
        this.annualReportPeriod5 = annualReportPeriod5;
    }

    public Integer getTurnover1() {
        return turnover1;
    }

    public void setTurnover1(Integer turnover1) {
        this.turnover1 = turnover1;
    }

    public Integer getTurnover2() {
        return turnover2;
    }

    public void setTurnover2(Integer turnover2) {
        this.turnover2 = turnover2;
    }

    public Integer getTurnover3() {
        return turnover3;
    }

    public void setTurnover3(Integer turnover3) {
        this.turnover3 = turnover3;
    }

    public Integer getTurnover4() {
        return turnover4;
    }

    public void setTurnover4(Integer turnover4) {
        this.turnover4 = turnover4;
    }

    public Integer getTurnover5() {
        return turnover5;
    }

    public void setTurnover5(Integer turnover5) {
        this.turnover5 = turnover5;
    }

    public Integer getResultAfterFinancialItems1() {
        return resultAfterFinancialItems1;
    }

    public void setResultAfterFinancialItems1(Integer resultAfterFinancialItems1) {
        this.resultAfterFinancialItems1 = resultAfterFinancialItems1;
    }

    public Integer getResultAfterFinancialItems2() {
        return resultAfterFinancialItems2;
    }

    public void setResultAfterFinancialItems2(Integer resultAfterFinancialItems2) {
        this.resultAfterFinancialItems2 = resultAfterFinancialItems2;
    }

    public Integer getResultAfterFinancialItems3() {
        return resultAfterFinancialItems3;
    }

    public void setResultAfterFinancialItems3(Integer resultAfterFinancialItems3) {
        this.resultAfterFinancialItems3 = resultAfterFinancialItems3;
    }

    public Integer getResultAfterFinancialItems4() {
        return resultAfterFinancialItems4;
    }

    public void setResultAfterFinancialItems4(Integer resultAfterFinancialItems4) {
        this.resultAfterFinancialItems4 = resultAfterFinancialItems4;
    }

    public Integer getResultAfterFinancialItems5() {
        return resultAfterFinancialItems5;
    }

    public void setResultAfterFinancialItems5(Integer resultAfterFinancialItems5) {
        this.resultAfterFinancialItems5 = resultAfterFinancialItems5;
    }

    public String getRatingDateLatestChange() {
        return ratingDateLatestChange;
    }

    public void setRatingDateLatestChange(String ratingDateLatestChange) {
        this.ratingDateLatestChange = ratingDateLatestChange;
    }

    public String getClaimOnBankruptCompaniesDate() {
        return claimOnBankruptCompaniesDate;
    }

    public void setClaimOnBankruptCompaniesDate(String claimOnBankruptCompaniesDate) {
        this.claimOnBankruptCompaniesDate = claimOnBankruptCompaniesDate;
    }

}
