package com.coolweather.android.gson;

/**
 * Created by 唐凯 on 2018/3/7.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
