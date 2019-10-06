package com.charlezz.distudy.qualifier;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = QModule.class)
public interface QComp {

    @Named("양파")
    Snack getOnionSnack();


    @Named("새우")
    Snack getShirimpSnack();
}
