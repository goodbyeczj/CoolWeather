package com.coolweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * Created by dark on 2017/6/7.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private  int probinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProbinceCode() {
        return probinceCode;
    }

    public void setProbinceCode(int probinceCode) {
        this.probinceCode = probinceCode;
    }
}
