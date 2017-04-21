package com.baronzhang.android.coremodel.http;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import com.baronzhang.android.coremodel.BuildConfig;
import com.baronzhang.android.coremodel.http.configuration.ApiConfiguration;
import com.baronzhang.android.coremodel.http.converter.FastJsonConverterFactory;
import com.baronzhang.android.coremodel.http.services.AppService;
import com.baronzhang.android.coremodel.http.services.IMService;
import com.baronzhang.android.coremodel.http.services.NewHouseService;
import com.baronzhang.android.coremodel.http.services.SecondHouseService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2017/1/5
 */
public final class ApiClient {

    public static AppService appService;
    public static IMService imService;
    public static NewHouseService newHouseService;
    public static SecondHouseService secondHouseService;

    public static ApiConfiguration configuration;

    public static void init(ApiConfiguration configuration){

        ApiClient.configuration = configuration;

        appService = initService("", AppService.class);
        imService = initService("", IMService.class);
        newHouseService = initService("", NewHouseService.class);
        secondHouseService = initService("", SecondHouseService.class);
    }

    private static <T> T initService(String baseUrl, Class<T> clazz) {

        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            builder.addInterceptor(httpLoggingInterceptor).addNetworkInterceptor(new StethoInterceptor());
        }
        OkHttpClient client = builder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(FastJsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();

        return retrofit.create(clazz);
    }
}
