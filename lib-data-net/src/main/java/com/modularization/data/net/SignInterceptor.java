package com.modularization.data.net;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * 用于API签名的拦截器
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class SignInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        return null;
    }
}
