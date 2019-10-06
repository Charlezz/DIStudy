package com.charlezz.distudy.subcomp;

import dagger.Subcomponent;

@MyScope
@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {
    //서브컴포넌트는 반드시 하나의 팩토리 또는 빌더를 가져야한다.

    String getString();
    Integer getInteger();

    Long getLong();

    @Subcomponent.Factory
    interface Factory{
        ChildComponent create(ChildModule module);
    }
}
