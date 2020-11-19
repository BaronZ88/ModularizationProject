package com.modularization.android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.modularization.android.main.MainActivity;
import com.baronzhang.android.modularization.R;

/**
 * App闪屏页
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}