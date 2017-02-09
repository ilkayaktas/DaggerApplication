package com.ilkayaktas.daggerapplication.injectors;

import com.ilkayaktas.daggerapplication.views.CarActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by iaktas on 09.02.2017.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(CarActivity carActivity);
}