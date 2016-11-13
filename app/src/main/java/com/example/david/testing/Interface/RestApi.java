package com.example.david.testing.Interface;

import com.example.david.testing.model.Models;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ASUS on 11/13/2016.
 */
public interface RestApi {
    @GET("contohjson")
    Call<Models> getDataAdmin();

}