package com.charlezz.distudy;

import com.charlezz.distudy.multi.DaggerMultiComponent;

import org.junit.Test;

public class MultiTest {

    @Test
    public void test(){
        System.out.println(DaggerMultiComponent.create().getStrings());
    }

    @Test
    public void test2(){
        System.out.println(DaggerMultiComponent.create().getIntegers().get("백"));
    }
}
