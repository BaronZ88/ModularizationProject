package com.baronzhang.android.secondhouse.api;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author baronzhang
 */
public interface ISecondHouseService extends IProvider {

    SecondHouseData fetchSecondHouseData();
}
