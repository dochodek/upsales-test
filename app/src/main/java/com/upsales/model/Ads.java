
package com.upsales.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Ads implements Serializable {

    @SerializedName("clicks")
    @Expose
    private Integer clicks;
    @SerializedName("impressions")
    @Expose
    private Integer impressions;

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public void setImpressions(Integer impressions) {
        this.impressions = impressions;
    }

}
