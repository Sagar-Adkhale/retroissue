
package com.sagar.retrofitcc.entity.joblistentity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Current {

    @SerializedName("utcEpoch")
    @Expose
    private Integer utcEpoch;
    @SerializedName("tzEpoch")
    @Expose
    private Integer tzEpoch;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("id")
    @Expose
    private String id;

    public Integer getUtcEpoch() {
        return utcEpoch;
    }

    public void setUtcEpoch(Integer utcEpoch) {
        this.utcEpoch = utcEpoch;
    }

    public Integer getTzEpoch() {
        return tzEpoch;
    }

    public void setTzEpoch(Integer tzEpoch) {
        this.tzEpoch = tzEpoch;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
