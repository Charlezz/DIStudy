package com.charlezz.distudy.why;
public class Computer {
    Cpu cpu;


    public      Computer(Cpu cpu){
        this.cpu = cpu;
    }
    //주입
    public void setCpu(Cpu cpu){
        this.cpu = cpu;
    }

    public Cpu getCpu(){
        return cpu;
    }
}