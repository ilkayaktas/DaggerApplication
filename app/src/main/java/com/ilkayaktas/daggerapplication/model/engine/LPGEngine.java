package com.ilkayaktas.daggerapplication.model.engine;

import android.util.Log;

import com.ilkayaktas.daggerapplication.model.Engine;

/**
 * Created by iaktas on 09.02.2017.
 */

public class LPGEngine implements Engine {

    @Override
    public void turnOn() {
        Log.v("DaggerApplication", "LPG Engine turned on");
    }

    @Override
    public void turnOff() {
        Log.v("DaggerApplication", "LPG Engine turned off.");
    }
}
