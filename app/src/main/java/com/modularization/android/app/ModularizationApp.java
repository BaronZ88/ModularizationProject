package com.modularization.android.app;

import android.app.Application;

import androidx.multidex.MultiDex;

import com.alibaba.android.arouter.launcher.ARouter;
import com.modularization.android.data.http.ApiClient;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class ModularizationApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        ARouter.init(this);
        ApiClient.getInstance().init(null);
    }
}