package com.sagar.retrofitcc.network;

import com.sagar.retrofitcc.constant.AppConstatnts;
import com.sagar.retrofitcc.entity.bodyentity.StartQRBody;
import com.sagar.retrofitcc.entity.bodyentity.TwoQRBody;
import com.sagar.retrofitcc.entity.joblistentity.JobListEntity;
import com.sagar.retrofitcc.entity.jobresponse.JobResponseEntity;
import com.sagar.retrofitcc.entity.userentity.UserInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIRequestService {

    @GET("/api/users/me")
    Call<UserInfo> getUserData(@Header(AppConstatnts.AUTHENTICATION) String barerToken);

    @GET("/api/jobs")
    Call<JobListEntity> gettingJobList(@Header(AppConstatnts.AUTHENTICATION) String barerToken);


    @POST("/api/jobs/start")
    Call<JobResponseEntity> startJob(@Header(AppConstatnts.AUTHENTICATION) String barerToken, @Body StartQRBody startQRBody);



    @POST("/api/jobs/{method}")
    Call<JobResponseEntity> cancelfinishJob(@Path(value = "method", encoded = true) String clickmethod, @Header(AppConstatnts.AUTHENTICATION) String barerToken, @Body TwoQRBody startQRBody);



}
