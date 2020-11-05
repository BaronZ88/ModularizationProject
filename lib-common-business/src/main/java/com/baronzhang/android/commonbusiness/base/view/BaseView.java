package com.baronzhang.android.commonbusiness.base.view;

/**
 * view interface,所有View(此项目中的View主要是Fragment和自定义的ViewGroup)必须实现此接口
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 */
public interface BaseView<T> {

    void setPresenter(T presenter);
}
