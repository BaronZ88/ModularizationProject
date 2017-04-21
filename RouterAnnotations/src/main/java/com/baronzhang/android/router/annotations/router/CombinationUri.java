package com.baronzhang.android.router.annotations.router;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解 Activity 跳转方法，用于生产完整的跳转 Uri
 * <p>
 * FullUri 的优先级高于 CombinationUri, 如果一个 Activity 的跳转方法即添加了 @FullUri 又添加了 @CombinationUri, 则 @CombinationUri 被忽略.
 * <p>
 * 组合规则:
 * <scheme>://<host>:<port>/<path>
 * 例如:
 * openAnjukeApp://com.baronzhang.android.im:6666/im/home
 * <p>
 * 其中
 * scheme: openAnjukeApp
 * host: com.baronzhang.android.im
 * port: 6666
 * path: im/home
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/3
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CombinationUri {

    String scheme();

    String host();

    String port() default "";

    String path() default "";
}
