package com.charlezz.distudy.how2;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class MyModule {

    @Binds
    abstract CharSequence getCharSequence(String str);

}
