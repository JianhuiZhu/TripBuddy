package com.mchack2016.tripbuddy.util.activity;

import android.os.Bundle;

import com.mchack2016.tripbuddy.R;
import com.mchack2016.tripbuddy.util.FragmenUtil;
import com.mchack2016.tripbuddy.view.TestView;


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
