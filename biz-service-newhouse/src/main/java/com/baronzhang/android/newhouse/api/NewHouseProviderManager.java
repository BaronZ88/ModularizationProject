package com.baronzhang.android.newhouse.api;

import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.service.base.ResponseCallback;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class NewHouseProviderManager {

    public static NewHouseProvider getNewHouseProvider(){
        return (NewHouseProvider) ARouter.getInstance().build(NewHouseRouterTable.PATH_SERVICE_NEW_HOUSE).navigation();
    }
}
