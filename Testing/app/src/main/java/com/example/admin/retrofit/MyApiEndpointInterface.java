package com.example.admin.retrofit;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by admin on 29-09-2016.
 */

public interface MyApiEndpointInterface {
    // Request method and URL specified in the annotation
    // Callback for the parsed response is the last parameter

    @GET("GetSubServices")
    Call<JsonElement> GetSubServices(@Query("serviceId") String serviceId);  //@Query("sort") String sort

}
