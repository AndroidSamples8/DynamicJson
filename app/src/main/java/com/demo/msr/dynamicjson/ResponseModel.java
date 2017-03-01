package com.demo.msr.dynamicjson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by MSR on 3/1/2017.
 */

public class ResponseModel {
    @SerializedName("name")
    public String name;
    @SerializedName("year")
    public String year;
    @SerializedName("result")
    List<Result> resultsList;

}
