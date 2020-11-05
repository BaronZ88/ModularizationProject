package com.baronzhang.android.im.api;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author baronzhang
 */
public interface IIMService extends IProvider {

    IMData fetchIMData();
}
