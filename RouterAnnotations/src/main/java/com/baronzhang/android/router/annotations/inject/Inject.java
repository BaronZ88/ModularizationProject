package com.baronzhang.android.router.annotations.inject;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/14
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface Inject {

    String value() default "";
}
