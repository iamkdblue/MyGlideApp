package com.kdblue.glideapp.Rest;

import com.kdblue.glideapp.Model.Details;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

/**
 * Created by kulde on 7/19/2017.
 */

public interface ApiInterface {

    @Headers("X-Mashape-Key: 9cgpBudjsQmsh5fZv6zutIN5Nocdp1UMbxjjsni39lTtsJu9Wc")
    @GET("?cat=famous&count=10")
    Call<List<Details>> getQuotes(@QueryMap Map<String, String> options);
}
