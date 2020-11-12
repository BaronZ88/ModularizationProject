package com.baronzhang.android.renthouse.api;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class RentHouseData {

    private String id;
    private String brokerName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    @Override
    public String toString() {
        return " RentHouseData:\n" +
                "   id='" + id + '\'' + "\n" +
                "   brokerName='" + brokerName + '\'';
    }
}
