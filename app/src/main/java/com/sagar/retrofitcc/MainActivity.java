package com.sagar.retrofitcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sagar.retrofitcc.entity.bodyentity.StartQRBody;
import com.sagar.retrofitcc.entity.bodyentity.TwoQRBody;
import com.sagar.retrofitcc.entity.jobresponse.JobResponseEntity;
import com.sagar.retrofitcc.network.APIRequestService;
import com.sagar.retrofitcc.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tag);
    }

    public void buttonpress(View view) {
        APIRequestService apiRequestService = RetrofitClient.getApiService();
        TwoQRBody twoQRBody = new TwoQRBody();
//                twoQRBody.qrCode = "qrCode";
        String barerToken="Bearer "+"12/U/20882/1591666705264/fc4fada0a6a7492fcdf5b7630ce533f2";
        twoQRBody.qrCode="https://sqr.ai/a0GPkRc";
        twoQRBody.startQrCode="https://sqr.ai/a0GPkRc";
        //           twoQRBody.startQrCode = "qrCode";
        Call<JobResponseEntity> call=apiRequestService.cancelfinishJob("finish",barerToken,twoQRBody);
        call.enqueue(new Callback<JobResponseEntity>() {
            @Override
            public void onResponse(Call<JobResponseEntity> call, Response<JobResponseEntity> response) {
                if (response.isSuccessful() && response.body() != null) {
                    JobResponseEntity jobResponseEntity=response.body();
                    textView.setText(jobResponseEntity.getStatus());
                    Toast.makeText(getApplicationContext(),jobResponseEntity.getJobId(),Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"faile",Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onFailure(Call<JobResponseEntity> call, Throwable t) {

            }
        });

    }
}
