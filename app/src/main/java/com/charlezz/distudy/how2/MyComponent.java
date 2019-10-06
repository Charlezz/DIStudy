package com.charlezz.distudy.how2;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {MyModule.class, StringModule.class})
public interface MyComponent {

    String provideString();

    void inject(Application application);
//
//    @Component.Builder
//    interface Builder{
//        //빌더 생성 조건
//        //반드시 하나의 build 메소드가 있어야함, 매개변수 없어야함
//        Builder setModule(MyModule module);
//        MyComponent build();
//    }

    @Component.Factory
    interface Factory{
        MyComponent create( @BindsInstance Activity activity);
    }
}
