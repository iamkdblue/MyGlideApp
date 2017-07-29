package com.kdblue.glideapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.kdblue.glideapp.Adapter.DetailsAdapter;
import com.kdblue.glideapp.Model.Details;
import com.kdblue.glideapp.R;
import com.kdblue.glideapp.Rest.ApiClient;
import com.kdblue.glideapp.Rest.ApiInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


        RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Map<String, String> data = new HashMap<>();
        data.put("cat", "famous");
        data.put("count", "10");

        Call<List<Details>> detailsCall = apiInterface.getQuotes(data);
        detailsCall.enqueue(new Callback<List<Details>>() {
            @Override
            public void onResponse(Call<List<Details>> call, Response<List<Details>> response) {

                List<Details> detailsList=response.body();
                Log.d("kkk",""+detailsList.get(0).getQuote());
                DetailsAdapter detailsAdapter = new DetailsAdapter(getApplicationContext(),detailsList);
                recyclerView.setAdapter(detailsAdapter);

            }

            @Override
            public void onFailure(Call<List<Details>> call, Throwable t) {
                Log.d("kkk","fail"+t.toString());
            }


        });
    }
}
