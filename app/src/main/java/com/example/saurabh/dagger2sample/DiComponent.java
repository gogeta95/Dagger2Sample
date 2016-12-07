package com.example.saurabh.dagger2sample;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by saurabh on 7/10/16.
 */
@Singleton
@Component(modules = {NetworkApiModule.class})
public interface DiComponent {
    void inject(MainActivity.Mehclass mehclass);
}
