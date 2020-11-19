package com.modularization.android.data.http;

import com.modularization.android.data.http.service.ServiceWrap;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import com.modularization.android.data.BuildConfig;
import com.modularization.android.data.http.configuration.ApiConfiguration;
import com.modularization.android.data.http.converter.FastJsonConverterFactory;

import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 * 2017/1/5
 */
public final class ApiClient {

    private OkHttpClient client;
    private ApiConfiguration configuration;
    private Map<String, Object> apiServiceMap;

    private static volatile ApiClient instance;

    private ApiClient() {
    }

    public static ApiClient getInstance(){
        if(instance == null){
            synchronized (ApiClient.class){
                if(instance == null){
                    instance = new ApiClient();
                }
            }
        }
        return instance;
    }

    public void init(ApiConfiguration configuration) {

        this.configuration = configuration;
        this.apiServiceMap = new HashMap<>();

        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(httpLoggingInterceptor).addNetworkInterceptor(new StethoInterceptor());
        }
        builder.addNetworkInterceptor(new SignInterceptor());
        this.client = builder.build();
    }

    public synchronized <T> T getService(ServiceWrap<T> proxy) {

        String host = proxy.getHost();
        Class<T> serviceClass = proxy.getRealService();

        String key = proxy.getModuleName() + "$$" + proxy.getIdentify();

        if (apiServiceMap.containsKey(key)) {
            Object service = apiServiceMap.get(key);
            if (serviceClass.isInstance(service)) {
                return serviceClass.cast(service);
            }
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(host)
                .addConverterFactory(FastJsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        T service = retrofit.create(serviceClass);
        apiServiceMap.put(key, service);
        return service;
    }
}
