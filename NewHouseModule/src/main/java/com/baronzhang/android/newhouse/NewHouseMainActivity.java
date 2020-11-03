package com.baronzhang.android.newhouse;

import android.os.Bundle;
import android.widget.TextView;

import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;

public class NewHouseMainActivity extends BaseActivity {

    String cityId;
    HouseDetail houseDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_house_activity_new_house_main);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText("城市ID: " + cityId);
        textView2.setText("新房: " + houseDetail);
    }
}
