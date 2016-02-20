package com.mchack2016.tripbuddy.util.util.activity;

import android.os.Bundle;

import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.ndk.CrashlyticsNdk;
import com.firebase.client.Firebase;
import com.jianhui_zhu.openuseragent.R;
import com.jianhui_zhu.openuseragent.util.FragmenUtil;
import com.jianhui_zhu.openuseragent.view.TestView;

import io.fabric.sdk.android.Fabric;

/**
 * Created by jianhuizhu on 2016-01-27
 */
public class MainActivity extends AbstractActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		FragmenUtil.switchToFragment(this, new TestView());

	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPostResume() {
		super.onPostResume();
	}
}
