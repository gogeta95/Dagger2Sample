package com.example.saurabh.dagger2sample;

/**
 * Created by saurabh on 7/10/16.
 */

public class Application extends android.app.Application{
        DiComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component=DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent() {
        return component;
    }
}
