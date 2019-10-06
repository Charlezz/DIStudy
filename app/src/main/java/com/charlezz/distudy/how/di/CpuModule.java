package com.charlezz.distudy.how.di;

import com.charlezz.distudy.how.AMDCpu;
import com.charlezz.distudy.how.Cpu;

import dagger.Module;
import dagger.Provides;

@Module
public class CpuModule {

    @Provides
    Cpu provideCpu(){
        System.out.println("CPU 생성 요청");
        return new AMDCpu();
    }

}
