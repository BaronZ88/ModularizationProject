package com.baronzhang.android.newhouse;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.baronzhang.android.data.http.ApiClient;
import com.baronzhang.android.newhouse.api.NewHouseApiData;
import com.baronzhang.android.newhouse.api.NewHouseProvider;
import com.baronzhang.android.newhouse.api.NewHouseData;
import com.baronzhang.android.newhouse.api.NewHouseRouterTable;
import com.baronzhang.android.newhouse.http.ApiService;
import com.baronzhang.android.newhouse.http.ApiServiceWrap;
import com.baronzhang.android.newhouse.model.GitHubUser;
import com.baronzhang.android.service.base.ErrorMessage;
import com.baronzhang.android.service.base.ResponseCallback;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
@Route(path = NewHouseRouterTable.PATH_SERVICE_NEW_HOUSE)
public class NewHouseProviderImpl implements NewHouseProvider {

    @Override
    public void init(Context context) {

    }

    @Override
    public NewHouseData fetchNewHouseData() {

        NewHouseData data = new NewHouseData();
        data.setId("1");
        data.setTitle("国贸佘山原墅");
        data.setAddress("上海市松江区佘山镇");
        data.setPrice("1200万/幢");
        return data;
    }

    @Override
    public void callNewHouseApi(ResponseCallback<NewHouseApiData> callback) {
        ApiClient.getInstance().getService(new ApiServiceWrap()).getGitHubUser("BaronZ88")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GitHubUser>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onFailed(new ErrorMessage(403, e.getMessage()));
                    }

                    @Override
                    public void onNext(GitHubUser gitHubUser) {
                        if(gitHubUser!=null){
                            NewHouseApiData data = new NewHouseApiData();
                            data.setAvatarUrl(gitHubUser.getAvatarUrl());
                            data.setBio(gitHubUser.getBio());
                            data.setBlog(gitHubUser.getBlog());
                            data.setCompany(gitHubUser.getCompany());
                            data.setEmail(gitHubUser.getEmail());
                            data.setFollowers(gitHubUser.getFollowers());
                            data.setLocation(gitHubUser.getLocation());
                            data.setName(gitHubUser.getName());
                            callback.onSuccess(data);
                        }else{
                            callback.onFailed(new ErrorMessage(405, "未获取到数据"));
                        }
                    }
                });
    }
}
