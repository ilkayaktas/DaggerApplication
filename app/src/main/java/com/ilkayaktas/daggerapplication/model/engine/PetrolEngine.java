package com.ilkayaktas.daggerapplication.model.engine;

import android.util.Log;

import com.ilkayaktas.daggerapplication.model.Engine;

/**
 * Created by iaktas on 09.02.2017.
 */

public class PetrolEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerApplication", "Petrol Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerApplication", "Petrol Engine turned off.");
    }
}
