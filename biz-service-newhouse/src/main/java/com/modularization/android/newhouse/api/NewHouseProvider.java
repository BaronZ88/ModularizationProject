package com.modularization.android.newhouse.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.modularization.android.service.base.ResponseCallback;

import rx.Subscription;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public interface NewHouseProvider extends IProvider {

    NewHouseData fetchNewHouseData();

    Subscription callNewHouseApi(ResponseCallback<NewHouseApiData> callback);
}