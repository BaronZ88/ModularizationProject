package com.baronzhang.android.secondhouse;

import android.os.Bundle;
import android.widget.TextView;

import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;
import com.baronzhang.android.router.RouterInjector;
import com.baronzhang.android.router.annotation.inject.Inject;

import java.util.ArrayList;

public class SecondHouseMainActivity extends BaseActivity {

    @Inject
    String cityId;
    @Inject("houseDetailList")
    ArrayList<HouseDetail> houseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_house_activity_second_house_main);

        RouterInjector.inject(this);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText("城市ID: " + cityId);
        textView2.setText("房源列表: " + houseList);
    }
}
