package com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author: Frank
 * created on: 2019/7/29 10:27
 * description:
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
