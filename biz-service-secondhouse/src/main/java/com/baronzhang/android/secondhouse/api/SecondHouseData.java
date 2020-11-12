package com.baronzhang.android.secondhouse.api;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class SecondHouseData {

    private String id;
    private String title;
    private String address;
    private String price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " SecondHouseData:\n" +
                "   id='" + id + '\'' + "\n" +
                "   title='" + title + '\'' + "\n" +
                "   address='" + address + '\'' + "\n" +
                "   price='" + price + '\'';
    }
}
