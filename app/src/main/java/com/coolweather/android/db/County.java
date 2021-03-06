package com.coolweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * Created by dark on 2017/6/7.
 */

public class County extends DataSupport {
    private int id;
    private  String countyName;
    private String weatherId;
    private  int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

}
