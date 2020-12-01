package com.modularization.biz.module.newhouse;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.modularization.biz.service.renthouse.RentHouseRouterTable;
import com.modularization.biz.service.newhouse.NewHouseRouterTable;
import com.modularization.common.base.activity.BaseActivity;
import com.modularization.common.model.HouseDetail;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

@Route(path = NewHouseRouterTable.PATH_ACTIVITY_MAIN)
public class MainActivity extends BaseActivity {

    @Autowired
    String cityId;

    @Autowired
    HouseDetail houseDetail;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_house_activity_main);
        unbinder = ButterKnife.bind(this);

        setSupportActionBar(findViewById(R.id.toolbar));
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ARouter.getInstance().inject(this);

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);

        textView1.setText("城市ID: " + cityId);
        textView2.setText("新房: \n" + houseDetail);
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
        ARouter.getInstance().build(RentHouseRouterTable.PATH_ACTIVITY_MAIN)
                .withString("cityId", "112")
                .withIntegerArrayList("brokerIdList", brokerIdList)
                .navigation();
    }
}
