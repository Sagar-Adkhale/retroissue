
package com.sagar.retrofitcc.entity.joblistentity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JobListEntity {

    @SerializedName("assets")
    @Expose
    private List<Asset> assets = null;

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

}
