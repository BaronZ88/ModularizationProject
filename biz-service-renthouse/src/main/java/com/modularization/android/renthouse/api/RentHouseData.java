package com.modularization.android.renthouse.api;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class RentHouseData {

    private String id;
    private String brokerName;
    private int age;
    private String address;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " RentHouseData:\n" +
                "   id=" + id + "\n" +
                "   brokerName=" + brokerName + "\n" +
                "   age=" + age + "岁" + "\n" +
                "   address=" + address;
    }
}
