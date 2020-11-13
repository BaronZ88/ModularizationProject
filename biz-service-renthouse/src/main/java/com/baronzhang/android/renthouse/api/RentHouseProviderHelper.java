package com.baronzhang.android.renthouse.api;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class RentHouseProviderHelper {

    public static RentHouseProvider getRentHouseProvider() {
        return (RentHouseProvider) ARouter.getInstance().build(RentHouseRouterTable.PATH_SERVICE_RENT_HOUSE).navigation();
    }
}
