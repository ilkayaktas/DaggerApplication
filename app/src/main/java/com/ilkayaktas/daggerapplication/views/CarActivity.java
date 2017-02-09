package com.ilkayaktas.daggerapplication.views;

import android.app.Activity;
import android.os.Bundle;

import com.ilkayaktas.daggerapplication.Dagger2Application;
import com.ilkayaktas.daggerapplication.R;
import com.ilkayaktas.daggerapplication.model.Car;

import javax.inject.Inject;

/**
 * Created by iaktas on 09.02.2017.
 */

public class CarActivity extends Activity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inject();

        car.start();
        car.stop();

    }

    private void inject(){
        Dagger2Application app = (Dagger2Application) getApplication();
        app.getAppComponent().inject(this);
    }
}