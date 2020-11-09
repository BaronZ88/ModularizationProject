package com.baronzhang.android.im;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.im.api.IMRouterTable;
import com.baronzhang.android.newhouse.api.NewHouseServiceProvider;

import java.util.ArrayList;

@Route(path = IMRouterTable.PATH_ACTIVITY_MAIN)
public class IMMainActivity extends BaseActivity {

    @Autowired
    String cityId;
    @Autowired
    ArrayList<Integer> brokerIdList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.im_activity_instant_messaging_main);

        ARouter.getInstance().inject(this);

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView4 = findViewById(R.id.textView4);

        textView1.setText("城市ID: " + cityId);
        textView2.setText("经纪人ID列表: " + brokerIdList);

        textView4.setText(NewHouseServiceProvider.getNewHouseService().fetchNewHouseData().toString());
    }
}
