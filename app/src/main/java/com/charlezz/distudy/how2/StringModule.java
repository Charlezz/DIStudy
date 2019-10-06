package com.charlezz.distudy.how2;

import dagger.Module;
import dagger.Provides;


@Module
public class StringModule {

    @Provides
    String provideString(){
        return "Charles";
    }
}
