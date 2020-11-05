package com.baronzhang.android.newhouse.api;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author baronzhang
 */
public interface INewHouseService extends IProvider {

    NewHouseData fetchNewHouseData();
}
