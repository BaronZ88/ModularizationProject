package com.modularization.biz.service.renthouse;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public interface RentHouseProvider extends IProvider {

    RentHouseData fetchRentHouseData();
}
