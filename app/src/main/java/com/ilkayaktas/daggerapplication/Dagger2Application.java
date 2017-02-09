package com.ilkayaktas.daggerapplication;

import android.app.Application;

import com.ilkayaktas.daggerapplication.injectors.AppComponent;
import com.ilkayaktas.daggerapplication.injectors.AppModule;

/**
 * Created by iaktas on 09.02.2017.
 */

public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();

    }

    private void initializeInjector(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}