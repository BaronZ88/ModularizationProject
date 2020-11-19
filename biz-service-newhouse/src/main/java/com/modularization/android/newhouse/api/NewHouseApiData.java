package com.modularization.android.newhouse.api;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class NewHouseApiData {

    private String avatarUrl;
    private String name;
    private String company;
    private String blog;
    private String location;
    private Object email;
    private String bio;
    private int followers;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "NewHouseApiData:\n" +
                "   avatarUrl=" + avatarUrl + "\n" +
                "   name=" + name + "\n" +
                "   company=" + company + "\n" +
                "   blog=" + blog + "\n" +
                "   location=" + location + "\n" +
                "   email=" + email + "\n" +
                "   bio=" + bio + "\n" +
                "   followers=" + followers;
    }
}
