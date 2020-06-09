package com.sagar.retrofitcc.network;

import com.sagar.retrofitcc.constant.AppConstatnts;

import com.sagar.retrofitcc.entity.bodyentity.TwoQRBody;
import com.sagar.retrofitcc.entity.jobresponse.JobResponseEntity;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIRequestService {




    @POST("/api/jobs/finish")
    Call<JobResponseEntity> cancelfinishJob(@Header(AppConstatnts.AUTHENTICATION) String barerToken, @Body TwoQRBody startQRBody);



}
