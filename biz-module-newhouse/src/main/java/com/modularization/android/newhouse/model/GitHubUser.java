package com.modularization.android.newhouse.model;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class GitHubUser {


    /**
     * login : BaronZ88
     * id : 7449405
     * node_id : MDQ6VXNlcjc0NDk0MDU=
     * avatar_url : https://avatars2.githubusercontent.com/u/7449405?v=4
     * gravatar_id :
     * url : https://api.github.com/users/BaronZ88
     * html_url : https://github.com/BaronZ88
     * followers_url : https://api.github.com/users/BaronZ88/followers
     * following_url : https://api.github.com/users/BaronZ88/following{/other_user}
     * gists_url : https://api.github.com/users/BaronZ88/gists{/gist_id}
     * starred_url : https://api.github.com/users/BaronZ88/starred{/owner}{/repo}
     * subscriptions_url : https://api.github.com/users/BaronZ88/subscriptions
     * organizations_url : https://api.github.com/users/BaronZ88/orgs
     * repos_url : https://api.github.com/users/BaronZ88/repos
     * events_url : https://api.github.com/users/BaronZ88/events{/privacy}
     * received_events_url : https://api.github.com/users/BaronZ88/received_events
     * type : User
     * site_admin : false
     * name : 张磊
     * company : Anjuke Inc.
     * blog : http://baronzhang.com
     * location : Shanghai, China
     * email : null
     * hireable : true
     * bio : 公众号:BaronTalk
     https://zhuanlan.zhihu.com/baron
     * public_repos : 17
     * public_gists : 10
     * followers : 1128
     * following : 23
     * created_at : 2014-04-30T12:09:38Z
     * updated_at : 2018-07-26T11:12:40Z
     */
    private String login;
    private int id;
    private String avatarUrl;
    private String htmlUrl;
    private String name;
    private String company;
    private String blog;
    private String location;
    private Object email;
    private String bio;
    private int publicRepos;
    private int publicGists;
    private int followers;
    private int following;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
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

    public int getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(int publicRepos) {
        this.publicRepos = publicRepos;
    }

    public int getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(int publicGists) {
        this.publicGists = publicGists;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }
}
