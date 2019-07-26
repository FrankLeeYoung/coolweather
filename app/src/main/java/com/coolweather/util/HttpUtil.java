package com.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * author: Frank
 * created on: 2019/7/26 14:38
 * description:
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
