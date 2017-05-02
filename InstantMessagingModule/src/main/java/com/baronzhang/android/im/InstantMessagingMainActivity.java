package com.baronzhang.android.im;

import android.os.Bundle;
import android.widget.TextView;

import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.router.RouterInjector;
import com.baronzhang.android.router.annotation.inject.Inject;
import com.baronzhang.android.router.annotation.inject.InjectUriParam;

import java.util.ArrayList;

public class InstantMessagingMainActivity extends BaseActivity {

    @InjectUriParam("cityId")
    String cityId;

    @Inject
    ArrayList<Integer> brokerIdList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.im_activity_instant_messaging_main);

        RouterInjector.inject(this);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText("城市ID: " + cityId);
        textView2.setText("经纪人ID列表: " + brokerIdList);

    }
}
