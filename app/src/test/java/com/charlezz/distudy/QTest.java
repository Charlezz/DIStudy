package com.charlezz.distudy;

import com.charlezz.distudy.qualifier.DaggerQComp;
import com.charlezz.distudy.qualifier.QComp;

import org.junit.Test;

public class QTest {

    @Test
    public void test(){
        QComp comp = DaggerQComp.create();
        System.out.println(comp.getOnionSnack().name);
        System.out.println(comp.getShirimpSnack().name);
    }
}
