package com.charlezz.distudy;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

}
