package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 唐凯 on 2018/3/6.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provonceCode;
    public int getId(){
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

    public void setProvonceCode(int provonceCode) {
        this.provonceCode = provonceCode;
    }

    public int getProvonceCode() {
        return provonceCode;
    }
}
