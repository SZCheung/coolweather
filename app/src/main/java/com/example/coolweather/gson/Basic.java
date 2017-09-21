package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by D22396 on 2017/9/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    private String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
