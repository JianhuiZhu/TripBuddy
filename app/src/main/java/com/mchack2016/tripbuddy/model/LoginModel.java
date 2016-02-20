package com.mchack2016.tripbuddy.model;

import com.mchack2016.tripbuddy.model.beans.User;
import com.mchack2016.tripbuddy.util.RemoteDatabaseSingleton;

/**
 * Created by jianhuizhu on 2016-02-20.
 */
public class LoginModel {
    public void createDummyUsers(){
        User user1=new User();
        User user2=new User();

        user1.setEmail("fishsb19@gmail.com");
        user1.setPassword("12345678");
        user1.setFirstname("Jianhui");
        user1.setLastname("zhu");

        user2.setEmail("jianhuizhu1987@gmail.com");
        user2.setFirstname("yucun");
        user2.setLastname("li");
        user2.setPassword("12345678");

        RemoteDatabaseSingleton.getInstance().registerUser(user1);
        RemoteDatabaseSingleton.getInstance().registerUser(user2);
    }
}
