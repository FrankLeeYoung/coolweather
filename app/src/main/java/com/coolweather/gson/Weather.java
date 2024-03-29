package com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * author: Frank
 * created on: 2019/7/29 10:45
 * description:
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
