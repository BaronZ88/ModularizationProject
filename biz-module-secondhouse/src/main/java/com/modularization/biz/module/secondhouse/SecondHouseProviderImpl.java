package com.modularization.biz.module.secondhouse;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.modularization.biz.service.secondhouse.SecondHouseProvider;
import com.modularization.biz.service.secondhouse.SecondHouseData;
import com.modularization.biz.service.secondhouse.SecondHouseRouterTable;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
@Route(path = SecondHouseRouterTable.PATH_SERVICE_SECOND_HOUSE)
public class SecondHouseProviderImpl implements SecondHouseProvider {

    private Context context;

    @Override
    public void init(Context context) {
        this.context = context;
    }

    @Override
    public SecondHouseData fetchSecondHouseData() {
        SecondHouseData data = new SecondHouseData();
        data.setId("123123123123342");
        data.setTitle("潍坊1村3室2厅");
        data.setAddress("上海市浦东新区东方路10000号");
        data.setPrice("700万/套");
        return data;
    }

    @Override
    public Fragment getFragment(String routePath) {
        return (Fragment) ARouter.getInstance().build(SecondHouseRouterTable.PATH_FRAGMENT_BLANK)
                .withString("param1", "这是一个来自二手房的Fragment")
                .navigation(context);
    }
}
