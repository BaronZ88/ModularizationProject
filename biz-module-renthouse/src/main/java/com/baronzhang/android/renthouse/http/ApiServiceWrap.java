package com.baronzhang.android.renthouse.http;

import com.baronzhang.android.data.http.service.ServiceWrap;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class ApiServiceWrap implements ServiceWrap<ApiService> {

    @Override
    public String getIdentify() {
        return null;
    }

    @Override
    public String getModuleName() {
        return null;
    }

    @Override
    public String getHost() {
        return null;
    }

    @Override
    public Class<ApiService> getRealService() {
        return null;
    }
}
