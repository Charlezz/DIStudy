package com.charlezz.distudy.subcomp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ParentModule.class)
public interface ParentComponent {

    ChildComponent.Factory getChildComponentFactory();

    String getString();
}
