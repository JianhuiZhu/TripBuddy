package com.mchack2016.tripbuddy.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mchack2016.tripbuddy.R;
import com.mchack2016.tripbuddy.util.AbstractFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jianhuizhu on 2016-02-20.
 */
public class TestView extends AbstractFragment{
    @OnClick({R.id.login_button,R.id.register_button,R.id.sight_button,R.id.result_button})
    public void click(View view){
        switch (view.getId()){
            case R.id.login_button:
                break;
            case R.id.register_button:
                break;
            case R.id.sight_button:
                break;
            case R.id.result_button:
                break;
        }
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.view_test,container,false);
        ButterKnife.bind(this,view);
        return view;
    }

}
