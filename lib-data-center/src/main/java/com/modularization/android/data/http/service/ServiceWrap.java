package com.modularization.android.data.http.service;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public interface ServiceWrap<T> {

    String getIdentify();

    String getModuleName();

    String getHost();

    Class<T> getRealService();
}
