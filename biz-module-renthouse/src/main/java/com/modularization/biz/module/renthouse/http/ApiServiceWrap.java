package com.modularization.biz.module.renthouse.http;

import com.modularization.data.net.service.ServiceWrap;

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
