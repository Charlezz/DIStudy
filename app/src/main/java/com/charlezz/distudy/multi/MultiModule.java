package com.charlezz.distudy.multi;

import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@Module
public class MultiModule {
    @Provides
    @IntoSet
    String provideABC(){
        return "ABC";
    }

    @Provides
    @ElementsIntoSet
    Set<String> provideStrings(){
        HashSet<String> sets = new HashSet<>();
        sets.add("Charles");
        sets.add("CHu");
        sets.add("Kun");
        return sets;
    }


    @Provides
    @IntoMap
    @StringKey("백")
    int provideInt(){
        return 100;
    }

    @Provides
    @IntoMap
    @StringKey("이백")
    int provideInt200(){
        return 200;
    }


}
