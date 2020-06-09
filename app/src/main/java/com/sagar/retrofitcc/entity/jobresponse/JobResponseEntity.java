
package com.sagar.retrofitcc.entity.jobresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobResponseEntity {

    @SerializedName("asset")
    @Expose
    private Asset asset;
    @SerializedName("jobId")
    @Expose
    private String jobId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("startTzEpoch")
    @Expose
    private Integer startTzEpoch;
    @SerializedName("user")
    @Expose
    private User user;

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStartTzEpoch() {
        return startTzEpoch;
    }

    public void setStartTzEpoch(Integer startTzEpoch) {
        this.startTzEpoch = startTzEpoch;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
