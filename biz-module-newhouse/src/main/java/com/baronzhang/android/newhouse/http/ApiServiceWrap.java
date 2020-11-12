package com.baronzhang.android.newhouse.http;

import com.baronzhang.android.data.http.service.ServiceWrap;
import com.baronzhang.android.newhouse.Constants;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class ApiServiceWrap implements ServiceWrap<ApiService> {

    @Override
    public String getIdentify() {
        return Constants.Service.ID;
    }

    @Override
    public String getModuleName() {
        return Constants.Service.MODULE_NAME;
    }

    @Override
    public String getHost() {
        return Constants.Service.HOST;
    }

    @Override
    public Class<ApiService> getRealService() {
        return ApiService.class;
    }
}
