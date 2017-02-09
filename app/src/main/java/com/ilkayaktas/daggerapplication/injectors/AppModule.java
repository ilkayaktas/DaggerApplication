package com.ilkayaktas.daggerapplication.injectors;

import com.ilkayaktas.daggerapplication.Dagger2Application;
import com.ilkayaktas.daggerapplication.model.Car;
import com.ilkayaktas.daggerapplication.model.Engine;
import com.ilkayaktas.daggerapplication.model.car.BMWCar;
import com.ilkayaktas.daggerapplication.model.engine.LPGEngine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by iaktas on 09.02.2017.
 */


@Module
public class AppModule {

    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application) {
        this.dagger2Application = dagger2Application;
    }

    @Provides
    @Singleton
    Dagger2Application provideApp(){
        return dagger2Application;
    }

    @Provides @Singleton
    Engine provideEngine(){
        return new LPGEngine();
    }

    @Provides @Singleton
    Car provideCar(Engine engine){
        return new BMWCar(engine);
    }
}
