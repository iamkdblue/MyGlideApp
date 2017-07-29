package com.kdblue.glideapp.Rest;

import com.kdblue.glideapp.Model.Details;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kulde on 7/19/2017.
 */

public class ApiClient {







    public static final String BASE_URL="https://andruxnet-random-famous-quotes.p.mashape.com/";
    public static Retrofit retrofit = null;

    public static Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
