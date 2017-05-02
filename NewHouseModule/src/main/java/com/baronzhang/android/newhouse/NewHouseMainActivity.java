package com.baronzhang.android.newhouse;

import android.os.Bundle;
import android.widget.TextView;

import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;
import com.baronzhang.android.router.RouterInjector;
import com.baronzhang.android.router.annotation.inject.Inject;
import com.baronzhang.android.router.annotation.inject.InjectUriParam;

public class NewHouseMainActivity extends BaseActivity {

    @InjectUriParam
    String cityId;

    @Inject
    HouseDetail houseDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_house_activity_new_house_main);

        RouterInjector.inject(this);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText("城市ID: " + cityId);
        textView2.setText("新房: " + houseDetail);
    }
}
