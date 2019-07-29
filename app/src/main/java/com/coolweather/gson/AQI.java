package com.coolweather.gson;

/**
 * author: Frank
 * created on: 2019/7/29 10:25
 * description:
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
