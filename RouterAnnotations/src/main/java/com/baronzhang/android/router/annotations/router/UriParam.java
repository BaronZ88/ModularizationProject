package com.baronzhang.android.router.annotations.router;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于注解 Activity 跳转所需的参数, 通过它来生成最终的跳转 URI
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/3
 */
@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface UriParam {

    String value();
}
