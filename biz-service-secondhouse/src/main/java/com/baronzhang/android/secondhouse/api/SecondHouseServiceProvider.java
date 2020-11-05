package com.baronzhang.android.secondhouse.api;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author baronzhang
 */
public class SecondHouseServiceProvider {

    public static ISecondHouseService getSecondHouseService(){
        return (ISecondHouseService) ARouter.getInstance().build(SecondHouseRouterTable.PATH_SERVICE_SECOND_HOUSE).navigation();
    }
}
