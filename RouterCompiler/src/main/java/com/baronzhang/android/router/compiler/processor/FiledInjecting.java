package com.baronzhang.android.router.compiler.processor;

import java.lang.annotation.Annotation;

import javax.lang.model.type.TypeMirror;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/14
 */
final class FiledInjecting {

    private String name;
    private TypeMirror typeMirror;
    private String paramKey;
    private Class<? extends Annotation> annotation;

    FiledInjecting(String name, TypeMirror typeMirror, String paramKey, Class<? extends Annotation> annotation) {
        this.name = name;
        this.typeMirror = typeMirror;
        this.paramKey = paramKey;
        this.annotation = annotation;
    }

    String getName() {
        return name;
    }

    TypeMirror getTypeMirror() {
        return typeMirror;
    }

    String getParamKey() {
        return paramKey;
    }

    Class<? extends Annotation> getAnnotation() {
        return annotation;
    }
}
