package com.modularization.common.base.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public final class NetworkUtils {

    /**
     * 判断网络连接是否可用
     */
    public static Boolean isNetworkConnected(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (manager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            NetworkInfo mWiFiNetworkInfo = manager.getActiveNetworkInfo();
            if (mWiFiNetworkInfo != null) {
                return mWiFiNetworkInfo.getType() == ConnectivityManager.TYPE_WIFI
                        || mWiFiNetworkInfo.getType() == ConnectivityManager.TYPE_MOBILE;
            }
        } else {
            Network network = manager.getActiveNetwork();
            if (network != null) {
                NetworkCapabilities nc = manager.getNetworkCapabilities(network);
                if (nc != null) {
                    return nc.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
                            || nc.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR);
                }
            }
        }
        return false;
    }
}
