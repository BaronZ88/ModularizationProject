package com.baronzhang.android.im.api;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author baronzhang
 */
public class IMServiceProvider {

    public static IIMService getIMService() {
        return (IIMService) ARouter.getInstance().build(IMRouterTable.PATH_SERVICE_IM).navigation();
    }
}
