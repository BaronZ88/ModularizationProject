package com.baronzhang.android.im.api;

/**
 * @author baronzhang
 */
public class IMData {

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
        return " IMData:\n" +
                "   id='" + id + '\'' + "\n" +
                "   brokerName='" + brokerName + '\'';
    }
}
