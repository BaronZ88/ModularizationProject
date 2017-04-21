package com.baronzhang.android.secondhouse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondHouseMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_house_activity_second_house_main);

        ((TextView) findViewById(R.id.text_view)).setText("城市ID：" + getIntent().getData().getQueryParameter("cityId"));
    }
}
