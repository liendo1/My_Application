package com.example.myapplication;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

public interface flaskClient {
@Multipart
    @POST("/upload")
    Call<UploadResult>uploadMultipleFiles(@PartMap Map<String, RequestBody>files);

}
