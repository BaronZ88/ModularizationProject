package com.baronzhang.android.router;

import android.content.Context;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/15
 */
public final class RouterInjector {

    private static final Map<Class<?>, Constructor<? extends ParametersInjector>> INJECTING_MAP = new LinkedHashMap<>();

    public static void inject(Context target) {

        createInjecting(target);
    }

    private static ParametersInjector createInjecting(Context target) {

        Constructor<? extends ParametersInjector> constructor = findInjectorForClass(target.getClass());

        if (constructor == null) {
            return ParametersInjector.EMPTY;
        }

        try {
            return constructor.newInstance(target);
        } catch (InstantiationException e) {
            throw new RuntimeException("Unable to invoke " + constructor, e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + constructor, e);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException) cause;
            }
            if (cause instanceof Error) {
                throw (Error) cause;
            }
            throw new RuntimeException("Unable to create injecting instance.", cause);
        }
    }

    private static Constructor<? extends ParametersInjector> findInjectorForClass(Class<?> targetClass) {

        Constructor<? extends ParametersInjector> constructor = INJECTING_MAP.get(targetClass);
        if (constructor != null) {
            return constructor;
        }

        String className = targetClass.getName();
        try {
            Class<?> injectingClass = Class.forName(className + "_RouterInjecting");
            constructor = (Constructor<? extends ParametersInjector>) injectingClass.getConstructor(targetClass);
        } catch (NoSuchMethodException e) {
            constructor = findInjectorForClass(targetClass.getSuperclass());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        INJECTING_MAP.put(targetClass, constructor);
        return constructor;
    }
}
