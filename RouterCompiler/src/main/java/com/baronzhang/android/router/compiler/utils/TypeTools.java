package com.baronzhang.android.router.compiler.utils;

import com.baronzhang.android.router.compiler.Constants;

import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

import static com.baronzhang.android.router.compiler.Constants.PARCELABLE;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/17
 */
public final class TypeTools {

    private TypeMirror parcelableType;
    private TypeMirror serializableType;

    private Types typeUtils;

    public TypeTools(Types typeUtils, Elements elementUtils) {

        this.typeUtils = typeUtils;

        this.parcelableType = elementUtils.getTypeElement(PARCELABLE).asType();
        this.serializableType = elementUtils.getTypeElement(Constants.SERIALIZABLE).asType();
    }

    public int convertType(TypeMirror typeMirror) {

        switch (typeMirror.toString()) {
            case Constants.INT:
            case Constants.INTEGER_BOX:
                return Constants.TYPE_KIND.TYPE_INTEGER;
            case Constants.LONG:
            case Constants.LONG_BOX:
                return Constants.TYPE_KIND.TYPE_LONG;
            case Constants.FLOAT:
            case Constants.FLOAT_BOX:
                return Constants.TYPE_KIND.TYPE_FLOAT;
            case Constants.DOUBLE:
            case Constants.DOUBLE_BOX:
                return Constants.TYPE_KIND.TYPE_DOUBLE;
            case Constants.SHORT:
            case Constants.SHORT_BOX:
                return Constants.TYPE_KIND.TYPE_SHORT;
            case Constants.BYTE:
            case Constants.BYTE_BOX:
                return Constants.TYPE_KIND.TYPE_BYTE;
            case Constants.BOOLEAN:
            case Constants.BOOLEAN_BOX:
                return Constants.TYPE_KIND.TYPE_BOOLEAN;
            case Constants.STRING:
                return Constants.TYPE_KIND.TYPE_STRING;
            case Constants.CHAR_SEQUENCE:
                return Constants.TYPE_KIND.TYPE_CHAR_SEQUENCE;

            case Constants.ARRAY_INT:
                return Constants.TYPE_KIND.TYPE_ARRAY_INT;
            case Constants.ARRAY_LONG:
                return Constants.TYPE_KIND.TYPE_ARRAY_LONG;
            case Constants.ARRAY_FLOAT:
                return Constants.TYPE_KIND.TYPE_ARRAY_FLOAT;
            case Constants.ARRAY_DOUBLE:
                return Constants.TYPE_KIND.TYPE_ARRAY_DOUBLE;
            case Constants.ARRAY_SHORT:
                return Constants.TYPE_KIND.TYPE_ARRAY_SHORT;
            case Constants.ARRAY_BYTE:
                return Constants.TYPE_KIND.TYPE_ARRAY_BYTE;
            case Constants.ARRAY_BOOLEAN:
                return Constants.TYPE_KIND.TYPE_ARRAY_BOOLEAN;
            case Constants.ARRAY_STRING:
                return Constants.TYPE_KIND.TYPE_ARRAY_STRING;
            case Constants.ARRAY_CHAR_SEQUENCE:
                return Constants.TYPE_KIND.TYPE_ARRAY_CHAR_SEQUENCE;
            case Constants.ARRAY_PARCELABLE:
                return Constants.TYPE_KIND.TYPE_ARRAY_PARCELABLE;

            case Constants.ARRAY_LIST_INTEGER:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_INTEGER;
            case Constants.ARRAY_LIST_LONG:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_LONG;
            case Constants.ARRAY_LIST_FLOAT:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_FLOAT;
            case Constants.ARRAY_LIST_DOUBLE:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_DOUBLE;
            case Constants.ARRAY_LIST_SHORT:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_SHORT;
            case Constants.ARRAY_LIST_BYTE:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_BYTE;
            case Constants.ARRAY_LIST_BOOLEAN:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_BOOLEAN;
            case Constants.ARRAY_LIST_STRING:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_STRING;
            case Constants.ARRAY_LIST_CHAR_SEQUENCE:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_CHAR_SEQUENCE;
            case Constants.ARRAY_LIST_PARCELABLE:
                return Constants.TYPE_KIND.TYPE_ARRAY_LIST_PARCELABLE;

            default:
                if (typeUtils.isSubtype(typeMirror, parcelableType)) {
                    return Constants.TYPE_KIND.TYPE_PARCELABLE;
                }else if (typeUtils.isSubtype(typeMirror, serializableType)) {
                    if(typeUtils.asElement(typeMirror).toString().equals(Constants.ARRAY_LIST)){
                        return Constants.TYPE_KIND.TYPE_ARRAY_LIST_PARCELABLE;
                    }
                    return Constants.TYPE_KIND.TYPE_SERIALIZABLE;
                } else {
                    return Constants.TYPE_KIND.TYPE_OTHER_OBJECT;
                }
        }
    }
}
