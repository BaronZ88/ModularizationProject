package com.baronzhang.android.newhouse.api;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author baronzhang
 */
public class NewHouseServiceProvider {

    public static INewHouseService getNewHouseService(){
        return (INewHouseService) ARouter.getInstance().build(NewHouseRouterTable.PATH_SERVICE_NEW_HOUSE).navigation();
    }
}
