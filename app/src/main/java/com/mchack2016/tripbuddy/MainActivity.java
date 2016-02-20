package com.mchack2016.tripbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mchack2016.tripbuddy.util.FragmenUtil;
import com.mchack2016.tripbuddy.view.TestView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmenUtil.switchToFragment(this,new TestView());
    }
}
