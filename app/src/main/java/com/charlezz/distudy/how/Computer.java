package com.charlezz.distudy.how;

import javax.inject.Inject;

public class Computer {

//    @Inject //필드인젝션을 위한 애노테이션 선언
    public Cpu cpu;

    public Computer(){
        System.out.println("컴퓨터를 만들었지만 CPU는 제공받지 않았다!");
    }

    @Inject
    public Computer(Cpu cpu){
        this.cpu = cpu;
    }
    //주입

    @Inject //메서드 인젝션
    public void setCpu(Cpu cpu) {
        System.out.println("setCpu 호출됨!!!");
    }


    public Cpu getCpu(){
        return cpu;
    }
}