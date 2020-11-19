package com.modularization.android.secondhouse.api;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public interface SecondHouseProvider extends IProvider {

    SecondHouseData fetchSecondHouseData();
}
