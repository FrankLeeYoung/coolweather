package com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author: Frank
 * created on: 2019/7/29 10:21
 * description:
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
