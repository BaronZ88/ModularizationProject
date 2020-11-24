package com.modularization.data.net.service;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public interface ServiceWrap<T> {

    String getIdentify();

    String getModuleName();

    String getHost();

    Class<T> getRealService();
}
