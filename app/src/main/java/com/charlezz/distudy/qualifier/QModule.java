package com.charlezz.distudy.qualifier;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class QModule {

    @Provides
    @Named("새우")
    Snack provideSnack1(){
        return new Snack("새우깡");
    }

    @Provides
    @Named("양파")
    Snack provideSnack2(){
        return new Snack("양파링");
    }


}
