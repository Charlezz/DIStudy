package com.charlezz.distudy.multi;

import java.util.Map;
import java.util.Set;

import dagger.Component;

@Component(modules = MultiModule.class)
public interface MultiComponent {
    Set<String> getStrings();

    Map<String,Integer> getIntegers();
}
