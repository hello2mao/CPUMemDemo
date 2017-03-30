package com.hello2mao.cpumemdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sampler.getInstance().init(getApplicationContext(), 100L);
        Sampler.getInstance().start();
    }
}
