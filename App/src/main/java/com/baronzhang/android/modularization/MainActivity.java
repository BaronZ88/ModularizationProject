package com.baronzhang.android.modularization;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.baronzhang.android.commonbusiness.HouseDetail;
import com.baronzhang.android.commonbusiness.RouterService;
import com.baronzhang.android.router.Router;
import com.baronzhang.android.router.annotations.inject.InjectIntentExtrasParam;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    private RouterService routerService;

    private Unbinder unbinder;

    @InjectIntentExtrasParam
    String cityId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        routerService = new Router(this).create(RouterService.class);
    }

    @OnClick(R.id.btn_goto_new_house)
    public void startNewHouseActivity() {
        routerService.startNewHouseActivity("110", new HouseDetail());
    }

    @OnClick(R.id.btn_goto_second_house)
    public void startSecondHouseActivity() {
        routerService.startSecondHouseActivity("111", 181818);
    }

    @OnClick(R.id.btn_goto_im)
    public void startIMActivity() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(123);
        array.add(123234);
        routerService.startIMActivity("112", array);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null)
            unbinder.unbind();
    }
}
