package com.charlezz.distudy.how.di;


import com.charlezz.distudy.how.Computer;
import com.charlezz.distudy.how.Cpu;

import dagger.Component;

//컴포넌트의 제약조건 interface or abstract
@Component(modules = CpuModule.class)
public interface ComputerComponent {

    //반환 타입이 반드시 명시되어 있어야하고, 매개변수를 가질수없다.

    //프로비젼 메소드
    Cpu getCpu();
    //프로비전 메소드
    Computer getComputer();

    //필드인젝션 하기 위한 멤버인젝션 메소드
    //멤버인젝션메소드는 반환타입은 void 또는 컴포넌트타입만 가능
    //매개변수는 1개, 필드인젝션 타겟 오브젝트 타입


    //멤버-인젝션 메소드
    void inject(Computer computer);

}
