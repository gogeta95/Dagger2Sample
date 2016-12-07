package com.example.saurabh.dagger2sample;

/**
 * Created by saurabh on 7/10/16.
 */

public class NetworkApi {
    public boolean validateUser(String user,String pass){
        return !(user == null || user.length() == 0);
    }
}
