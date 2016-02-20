package com.mchack2016.tripbuddy.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jianhuizhu on 2016-01-27
 */
public class SharedPrefHelper {
	SharedPreferences sharedPreferences;


	public SharedPrefHelper(Context context){
		sharedPreferences = context.getSharedPreferences("forest", Context.MODE_PRIVATE);
	}
}
