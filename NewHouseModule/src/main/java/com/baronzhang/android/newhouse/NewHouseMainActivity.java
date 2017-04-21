package com.baronzhang.android.newhouse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NewHouseMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_house_activity_new_house_main);

        ((TextView) findViewById(R.id.text_view)).setText("城市ID：" + getIntent().getData().getQueryParameter("cityId"));
    }
}
