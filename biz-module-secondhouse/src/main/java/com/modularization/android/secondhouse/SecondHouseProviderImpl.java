package com.modularization.android.secondhouse;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.modularization.android.secondhouse.api.SecondHouseProvider;
import com.modularization.android.secondhouse.api.SecondHouseData;
import com.modularization.android.secondhouse.api.SecondHouseRouterTable;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
@Route(path = SecondHouseRouterTable.PATH_SERVICE_SECOND_HOUSE)
public class SecondHouseProviderImpl implements SecondHouseProvider {

    @Override
    public void init(Context context) {

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
}