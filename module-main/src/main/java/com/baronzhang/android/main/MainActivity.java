package com.baronzhang.android.main;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;
import com.baronzhang.android.newhouse.api.NewHouseApiData;
import com.baronzhang.android.renthouse.api.RentHouseData;
import com.baronzhang.android.renthouse.api.RentHouseRouterTable;
import com.baronzhang.android.renthouse.api.RentHouseProviderHelper;
import com.baronzhang.android.newhouse.api.NewHouseData;
import com.baronzhang.android.newhouse.api.NewHouseRouterTable;
import com.baronzhang.android.newhouse.api.NewHouseProviderHelper;
import com.baronzhang.android.secondhouse.api.SecondHouseData;
import com.baronzhang.android.secondhouse.api.SecondHouseRouterTable;
import com.baronzhang.android.secondhouse.api.SecondHouseProviderHelper;
import com.baronzhang.android.service.base.ErrorMessage;
import com.baronzhang.android.service.base.ResponseCallback;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import rx.Observable;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/**
 * App首页
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class MainActivity extends BaseActivity {

    private CompositeSubscription subscriptions;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        subscriptions = new CompositeSubscription();

        TextView newHouseTextView = findViewById(R.id.new_house_text_view);
        NewHouseData newHouseData = NewHouseProviderHelper.getNewHouseProvider().fetchNewHouseData();
        newHouseTextView.setText(newHouseData.toString());
        Subscription subscription = NewHouseProviderHelper.getNewHouseProvider().callNewHouseApi(new ResponseCallback<NewHouseApiData>() {
            @Override
            public void onSuccess(NewHouseApiData data) {
                newHouseTextView.setText(String.format("%s\n\n%s", newHouseTextView.getText(), data.toString()));
            }

            @Override
            public void onFailed(ErrorMessage errorMsg) {
                newHouseTextView.setText(String.format("%s\n\n%s", newHouseTextView.getText(), errorMsg));
            }
        });
        subscriptions.add(subscription);

        SecondHouseData secondHouseData = SecondHouseProviderHelper.getSecondHouseProvider().fetchSecondHouseData();
        ((TextView) findViewById(R.id.second_house_text_view)).setText(secondHouseData.toString());

        RentHouseData rentHouseData = RentHouseProviderHelper.getRentHouseProvider().fetchRentHouseData();
        ((TextView) findViewById(R.id.rent_house_text_view)).setText(rentHouseData.toString());
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
        houseDetailList.add(new HouseDetail("10004", "潍坊三村", 86));

        ARouter.getInstance().build(SecondHouseRouterTable.PATH_ACTIVITY_MAIN)
                .withString("cityId", "111")
                .withParcelableArrayList("houseList", houseDetailList)
                .navigation();
    }

    @OnClick(R2.id.btn_goto_rent_house)
    void startRentHouseActivity() {
        ArrayList<Integer> brokerIdList = new ArrayList<>();
        brokerIdList.add(20000);
        brokerIdList.add(20001);
        brokerIdList.add(20002);
        ARouter.getInstance().build(RentHouseRouterTable.PATH_ACTIVITY_MAIN)
                .withString("cityId", "112")
                .withIntegerArrayList("brokerIdList", brokerIdList)
                .navigation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null)
            unbinder.unbind();
        if (subscriptions != null)
            subscriptions.clear();
    }
}
