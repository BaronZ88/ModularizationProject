package com.modularization.android.secondhouse.api;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class SecondHouseProviderHelper {

    public static SecondHouseProvider getSecondHouseProvider(){
        return (SecondHouseProvider) ARouter.getInstance().build(SecondHouseRouterTable.PATH_SERVICE_SECOND_HOUSE).navigation();
    }
}
