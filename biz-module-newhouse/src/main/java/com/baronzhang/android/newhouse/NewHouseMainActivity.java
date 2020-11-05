package com.baronzhang.android.newhouse;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;
import com.baronzhang.android.im.api.IMRouterTable;
import com.baronzhang.android.newhouse.api.NewHouseRouterTable;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

@Route(path = NewHouseRouterTable.PATH_ACTIVITY_MAIN)
public class NewHouseMainActivity extends BaseActivity {

    @Autowired
    String cityId;

    @Autowired
    HouseDetail houseDetail;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_house_activity_new_house_main);
        unbinder = ButterKnife.bind(this);
        ARouter.getInstance().inject(this);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText("城市ID: " + cityId);
        textView2.setText("新房: " + houseDetail);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null)
            unbinder.unbind();
    }

    @OnClick(R2.id.button)
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
}
