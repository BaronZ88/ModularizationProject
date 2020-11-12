package com.baronzhang.android.renthouse;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.baronzhang.android.renthouse.api.RentHouseProvider;
import com.baronzhang.android.renthouse.api.RentHouseData;
import com.baronzhang.android.renthouse.api.RentHouseRouterTable;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
@Route(path = RentHouseRouterTable.PATH_SERVICE_RENT_HOUSE)
public class RentHouseProviderImpl implements RentHouseProvider {

    @Override
    public void init(Context context) {

    }

    @Override
    public RentHouseData fetchRentHouseData() {
        RentHouseData data = new RentHouseData();
        data.setId("123123123");
        data.setBrokerName("王大仙");
        return data;
    }
}
