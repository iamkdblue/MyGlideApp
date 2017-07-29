package com.kdblue.glideapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kulde on 7/20/2017.
 */

public class DetailsResponse {
    @SerializedName("quote")
    @Expose
    private String quote;
}
