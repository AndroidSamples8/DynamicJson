package com.demo.msr.dynamicjson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MSR on 3/1/2017.
 */

public class Result {
    @SerializedName("name")
    public String name;
    @SerializedName("country")
    public String country;
}
