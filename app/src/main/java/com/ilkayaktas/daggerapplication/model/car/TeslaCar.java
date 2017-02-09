package com.ilkayaktas.daggerapplication.model.car;

import android.util.Log;

import com.ilkayaktas.daggerapplication.model.Car;
import com.ilkayaktas.daggerapplication.model.Engine;

/**
 * Created by iaktas on 09.02.2017.
 */

public class TeslaCar implements Car{

    private Engine engine;

    public TeslaCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.v("DaggerApplication","Tesla Car is about to start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.v("DaggerApplication","Tesla Car is about to stop.");
        engine.turnOff();
    }
}