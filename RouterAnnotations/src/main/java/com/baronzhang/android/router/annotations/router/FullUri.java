package com.baronzhang.android.router.annotations.router;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解 Activity 跳转方法, FullUri 表示完整的 Uri
 * <p>
 * FullUri 的优先级高于 CombinationUri, 如果一个 Activity 的跳转方法即添加了 @FullUri 又添加了 @CombinationUri, 则 @CombinationUri 被忽略.
 * <p>
 * 例如：@FullUri("openAnjukeApp://com.anjuke.android.app:666/secondhouse/detail")
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/3
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FullUri {

    //完整的Intent URI
    String value();
}
