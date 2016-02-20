package com.mchack2016.tripbuddy.util;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by jianhuizhu on 2016-02-19.
 */
public class RemoteDatabaseSingleton {

    private RemoteDatabaseSingleton(String uID) {
        RemoteDatabaseSingleton.uID = uID;
    }

    private static String uID;
    private static RemoteDatabaseSingleton remoteDB = null;

    public static RemoteDatabaseSingleton getInstance(String uID) {
        if (remoteDB == null) {
            RemoteDatabaseSingleton.remoteDB = new RemoteDatabaseSingleton(uID);
        }
        return remoteDB;
    }


}
