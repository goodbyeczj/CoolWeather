package com.coolweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * Created by dark on 2017/6/7.
 */

public class City extends DataSupport {
    private int id;
    private  String cityName;
    private  int cityCode;
    private  int provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public int getId() {
        return id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
