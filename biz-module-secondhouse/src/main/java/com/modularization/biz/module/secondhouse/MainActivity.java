package com.modularization.biz.module.secondhouse;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.modularization.biz.service.secondhouse.SecondHouseRouterTable;
import com.modularization.common.base.activity.BaseActivity;
import com.modularization.common.model.HouseDetail;

import java.util.ArrayList;

@Route(path = SecondHouseRouterTable.PATH_ACTIVITY_MAIN)
public class MainActivity extends BaseActivity {

    @Autowired
    String cityId;
    @Autowired
    ArrayList<HouseDetail> houseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_house_activity_main);

        ARouter.getInstance().inject(this);

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);

        textView1.setText("城市ID: " + cityId);
        StringBuilder houseListStr = new StringBuilder();
        for(HouseDetail houseDetail : houseList){
            houseListStr.append(houseDetail.toString()).append("\n");
        }
        textView2.setText("房源列表: \n" + houseListStr.substring(0, houseListStr.length()-1));
    }
}
