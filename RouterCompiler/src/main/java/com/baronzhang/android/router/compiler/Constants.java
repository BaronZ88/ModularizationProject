package com.baronzhang.android.router.compiler;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 *         2017/3/17
 */
public final class Constants {

    private static final String JAVA_LANG = "java.lang";
    public static final String ARRAY_LIST = "java.util.ArrayList";

    public static final String INT = "int";
    public static final String INTEGER_BOX = JAVA_LANG + ".Integer";
    public static final String LONG = "long";
    public static final String LONG_BOX = JAVA_LANG + ".Long";
    public static final String FLOAT = "float";
    public static final String FLOAT_BOX = JAVA_LANG + ".Float";
    public static final String DOUBLE = "double";
    public static final String DOUBLE_BOX = JAVA_LANG + ".Double";
    public static final String SHORT = "short";
    public static final String SHORT_BOX = JAVA_LANG + ".Short";
    public static final String BYTE = "byte";
    public static final String BYTE_BOX = JAVA_LANG + ".Byte";
    public static final String BOOLEAN = "boolean";
    public static final String BOOLEAN_BOX = JAVA_LANG + ".Boolean";
    public static final String STRING = JAVA_LANG + ".String";
    public static final String CHAR_SEQUENCE = JAVA_LANG + ".CharSequence";

    public static final String PARCELABLE = "android.os.Parcelable";


    public static final String ARRAY_INT = INT + "[]";
    public static final String ARRAY_LONG = LONG + "[]";
    public static final String ARRAY_FLOAT = FLOAT + "[]";
    public static final String ARRAY_DOUBLE = DOUBLE + "[]";
    public static final String ARRAY_SHORT = SHORT + "[]";
    public static final String ARRAY_BYTE = BYTE + "[]";
    public static final String ARRAY_BOOLEAN = BOOLEAN + "[]";
    public static final String ARRAY_STRING = STRING + "[]";
    public static final String ARRAY_CHAR_SEQUENCE = CHAR_SEQUENCE + "[]";
    public static final String ARRAY_PARCELABLE = PARCELABLE + "[]";

    public static final String ARRAY_LIST_INTEGER = ARRAY_LIST + "<" + INTEGER_BOX + ">";
    public static final String ARRAY_LIST_LONG = ARRAY_LIST + "<" + LONG_BOX + ">";
    public static final String ARRAY_LIST_FLOAT = ARRAY_LIST + "<" + FLOAT_BOX + ">";
    public static final String ARRAY_LIST_DOUBLE = ARRAY_LIST + "<" + DOUBLE_BOX + ">";
    public static final String ARRAY_LIST_SHORT = ARRAY_LIST + "<" + SHORT_BOX + ">";
    public static final String ARRAY_LIST_BYTE = ARRAY_LIST + "<" + BYTE_BOX + ">";
    public static final String ARRAY_LIST_BOOLEAN = ARRAY_LIST + "<" + BOOLEAN_BOX + ">";
    public static final String ARRAY_LIST_STRING = ARRAY_LIST + "<" + STRING + ">";
    public static final String ARRAY_LIST_CHAR_SEQUENCE = ARRAY_LIST + "<" + CHAR_SEQUENCE + ">";
    public static final String ARRAY_LIST_PARCELABLE = ARRAY_LIST + "<" + PARCELABLE + ">";

    public static final String SERIALIZABLE = "java.io.Serializable";


    public final static class TYPE_KIND {

        public static final int TYPE_INTEGER = 1;
        public static final int TYPE_LONG = 2;
        public static final int TYPE_FLOAT = 3;
        public static final int TYPE_DOUBLE = 4;
        public static final int TYPE_SHORT = 5;
        public static final int TYPE_BYTE = 6;
        public static final int TYPE_BOOLEAN = 7;
        public static final int TYPE_STRING = 8;
        public static final int TYPE_CHAR_SEQUENCE = 9;
        public static final int TYPE_PARCELABLE = 10;

        public static final int TYPE_ARRAY_INT = 11;
        public static final int TYPE_ARRAY_LONG = 12;
        public static final int TYPE_ARRAY_FLOAT = 13;
        public static final int TYPE_ARRAY_DOUBLE = 14;
        public static final int TYPE_ARRAY_SHORT = 15;
        public static final int TYPE_ARRAY_BYTE = 16;
        public static final int TYPE_ARRAY_BOOLEAN = 17;
        public static final int TYPE_ARRAY_STRING = 18;
        public static final int TYPE_ARRAY_CHAR_SEQUENCE = 19;
        public static final int TYPE_ARRAY_PARCELABLE = 20;

        public static final int TYPE_ARRAY_LIST_INTEGER = 21;
        public static final int TYPE_ARRAY_LIST_LONG = 22;
        public static final int TYPE_ARRAY_LIST_FLOAT = 23;
        public static final int TYPE_ARRAY_LIST_DOUBLE = 24;
        public static final int TYPE_ARRAY_LIST_SHORT = 25;
        public static final int TYPE_ARRAY_LIST_BYTE = 26;
        public static final int TYPE_ARRAY_LIST_BOOLEAN = 27;
        public static final int TYPE_ARRAY_LIST_STRING = 28;
        public static final int TYPE_ARRAY_LIST_CHAR_SEQUENCE = 29;
        public static final int TYPE_ARRAY_LIST_PARCELABLE = 30;

        public static final int TYPE_SERIALIZABLE = 31;
        public static final int TYPE_OTHER_OBJECT = 32;
    }
}
