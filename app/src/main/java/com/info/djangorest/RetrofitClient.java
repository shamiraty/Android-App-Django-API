package com.info.djangorest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    //establish connection
    // private static final String URL="http://192.168.42.38:8000/";
    private static final String URL = "https://openprojects.pythonanywhere.com/";

    private static Retrofit retrofit = null;

    //public method that returns connection

    public static Retrofit getConnection() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
