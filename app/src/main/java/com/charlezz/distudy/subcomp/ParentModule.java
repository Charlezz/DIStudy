package com.charlezz.distudy.subcomp;

import java.util.Random;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = ChildComponent.class)
public class ParentModule {

    @Singleton
    @Provides
    Long provideLong(){
        return new Random().nextLong();
    }

    @Provides
    String provideString(){
        return "Hello World";
    }
}
