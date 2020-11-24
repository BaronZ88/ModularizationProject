package com.modularization.biz.service.newhouse;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.modularization.biz.service.base.ResponseCallback;

import rx.Subscription;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public interface NewHouseProvider extends IProvider {

    NewHouseData fetchNewHouseData();

    Subscription callNewHouseApi(ResponseCallback<NewHouseApiData> callback);
}