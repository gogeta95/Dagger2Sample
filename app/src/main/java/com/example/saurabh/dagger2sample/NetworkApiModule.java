package com.example.saurabh.dagger2sample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by saurabh on 7/10/16.
 */
@Module
public class NetworkApiModule {
    @Provides
    @Singleton
    public NetworkApi getNetworkApi(){
        return new NetworkApi();
    }
}
