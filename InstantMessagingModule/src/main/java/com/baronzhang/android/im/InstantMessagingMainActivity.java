package com.baronzhang.android.im;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.baronzhang.android.router.annotations.inject.InjectUriParam;

public class InstantMessagingMainActivity extends AppCompatActivity {

    @InjectUriParam("cityId")
    String cityId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.im_activity_instant_messaging_main);

        ((TextView) findViewById(R.id.text_view)).setText("城市ID：" + getIntent().getData().getQueryParameter("cityId"));
    }
}
