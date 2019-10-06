package com.charlezz.distudy;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityModule.class})
public interface AppComponent extends AndroidInjector<App> {
}
