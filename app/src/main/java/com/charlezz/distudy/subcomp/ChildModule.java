package com.charlezz.distudy.subcomp;

import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public class ChildModule {

    @MyScope
    @Provides
    Integer provideInteger() {
        return new Random().nextInt(1000);
    }
}
