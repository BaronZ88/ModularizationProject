package com.baronzhang.android.main;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;
import com.baronzhang.android.im.api.IMData;
import com.baronzhang.android.im.api.IMRouterTable;
import com.baronzhang.android.im.api.IMServiceProvider;
import com.baronzhang.android.newhouse.api.NewHouseData;
import com.baronzhang.android.newhouse.api.NewHouseRouterTable;
import com.baronzhang.android.newhouse.api.NewHouseServiceProvider;
import com.baronzhang.android.secondhouse.api.SecondHouseData;
import com.baronzhang.android.secondhouse.api.SecondHouseRouterTable;
import com.baronzhang.android.secondhouse.api.SecondHouseServiceProvider;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * App首页
 *
 * @author baronzhang
 */
public class MainActivity extends BaseActivity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        NewHouseData newHouseData = NewHouseServiceProvider.getNewHouseService().fetchNewHouseData();
        ((TextView) findViewById(R.id.new_house_text_view)).setText(newHouseData.toString());

        SecondHouseData secondHouseData = SecondHouseServiceProvider.getSecondHouseService().fetchSecondHouseData();
        ((TextView) findViewById(R.id.second_house_text_view)).setText(secondHouseData.toString());

        IMData imData = IMServiceProvider.getIMService().fetchIMData();
        ((TextView) findViewById(R.id.im_text_view)).setText(imData.toString());
    }

    @OnClick(R2.id.btn_goto_new_house)
    void startNewHouseActivity() {
        ARouter.getInstance().build(NewHouseRouterTable.PATH_ACTIVITY_MAIN)
                .withString("cityId", "110")
                .withParcelable("houseDetail", new HouseDetail("10000", "潍坊新村", 66))
                .navigation();
    }

    @OnClick(R2.id.btn_goto_second_house)
    void startSecondHouseActivity() {

        ArrayList<HouseDetail> houseDetailList = new ArrayList<>();
        houseDetailList.add(new HouseDetail("10001", "潍坊一村", 88));
        houseDetailList.add(new HouseDetail("10002", "潍坊二村", 120));
        houseDetailList.add(new HouseDetail("10003", "潍坊二村", 99));
        houseDetailList.add(new HouseDetail("10004", "潍坊三村", 86));
        houseDetailList.add(new HouseDetail("10005", "潍坊五村", 80));

        ARouter.getInstance().build(SecondHouseRouterTable.PATH_ACTIVITY_MAIN)
                .withString("cityId", "111")
                .withParcelableArrayList("houseList", houseDetailList)
                .navigation();
    }

    @OnClick(R2.id.btn_goto_im)
    void startIMActivity() {
        ArrayList<Integer> brokerIdList = new ArrayList<>();
        brokerIdList.add(20000);
        brokerIdList.add(20001);
        brokerIdList.add(20002);
        ARouter.getInstance().build(IMRouterTable.PATH_ACTIVITY_MAIN)
                .withString("cityId", "112")
                .withIntegerArrayList("brokerIdList", brokerIdList)
                .navigation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null)
            unbinder.unbind();
    }
}
