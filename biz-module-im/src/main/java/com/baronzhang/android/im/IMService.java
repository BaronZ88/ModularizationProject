package com.baronzhang.android.im;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.baronzhang.android.im.api.IIMService;
import com.baronzhang.android.im.api.IMData;
import com.baronzhang.android.im.api.IMRouterTable;

/**
 * @author baronzhang
 */
@Route(path = IMRouterTable.PATH_SERVICE_IM)
public class IMService implements IIMService {

    @Override
    public void init(Context context) {

    }

    @Override
    public IMData fetchIMData() {
        IMData data = new IMData();
        data.setId("123123123");
        data.setBrokerName("王大仙");
        return data;
    }
}
