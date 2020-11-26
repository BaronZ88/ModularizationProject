package com.modularization.data.local.preferences;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public enum AppSettings {

    /*默认配置项*/
    SETTINGS_FIRST_USE("first_use", Boolean.TRUE),
    SETTINGS_CURRENT_CITY_ID("current_city_id", ""),
    SETTINGS_CURRENT_CITY_NAME("current_city_name", "");

    private final String mId;
    private final Object mDefaultValue;

    AppSettings(String id, Object defaultValue) {
        this.mId = id;
        this.mDefaultValue = defaultValue;
    }

    public String getId() {
        return this.mId;
    }

    public Object getDefaultValue() {
        return this.mDefaultValue;
    }

    public static AppSettings fromId(String id) {
        AppSettings[] values = values();
        for (AppSettings value : values) {
            if (value.mId.equals(id)) {
                return value;
            }
        }
        return null;
    }
}
