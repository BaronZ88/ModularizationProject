package com.modularization.biz.service.newhouse;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class NewHouseProviderHelper {

    public static NewHouseProvider getNewHouseProvider(){
        return (NewHouseProvider) ARouter.getInstance().build(NewHouseRouterTable.PATH_SERVICE_NEW_HOUSE).navigation();
    }
}
