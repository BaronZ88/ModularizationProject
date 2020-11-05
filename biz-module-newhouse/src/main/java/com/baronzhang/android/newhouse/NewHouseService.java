package com.baronzhang.android.newhouse;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.baronzhang.android.newhouse.api.NewHouseData;
import com.baronzhang.android.newhouse.api.INewHouseService;
import com.baronzhang.android.newhouse.api.NewHouseRouterTable;

/**
 * @author baronzhang
 */
@Route(path = NewHouseRouterTable.PATH_SERVICE_NEW_HOUSE)
public class NewHouseService implements INewHouseService {

    @Override
    public void init(Context context) {

    }

    @Override
    public NewHouseData fetchNewHouseData() {

        NewHouseData data = new NewHouseData();
        data.setId("1");
        data.setTitle("国贸佘山原墅");
        data.setAddress("上海市松江区佘山镇");
        data.setPrice("1200万/幢");
        return data;
    }
}
