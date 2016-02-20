package com.mchack2016.tripbuddy.util.activity;

import android.app.Activity;
import android.os.Bundle;



/**
 * Created by jianhuizhu on 2016-01-27
 */
public abstract class AbstractActivity extends Activity {
//	private ObjectGraph mObjectGraph;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPostResume() {
		super.onPostResume();

	}

	@Override
	protected void onPause() {
		super.onPause();
	}
}
