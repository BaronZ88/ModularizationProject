package com.baronzhang.android.service.base;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public interface ResponseCallback<T> {

    void onSuccess(T t);

    void onFailed(ErrorMessage errorMsg);
}
