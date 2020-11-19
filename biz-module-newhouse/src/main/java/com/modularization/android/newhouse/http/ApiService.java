package com.modularization.android.newhouse.http;

import com.modularization.android.newhouse.model.GitHubUser;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2017/1/5
 */
public interface ApiService {

    @GET("users/{user}")
    Observable<GitHubUser> getGitHubUser(@Path("user") String userName);
}
