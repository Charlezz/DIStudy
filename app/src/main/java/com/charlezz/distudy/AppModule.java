package com.charlezz.distudy;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    String provideString(){
        return "Hello World!!!!!!!!!!!!!!!!!";
    }
}
