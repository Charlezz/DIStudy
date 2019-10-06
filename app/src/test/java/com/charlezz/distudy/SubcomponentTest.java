package com.charlezz.distudy;

import com.charlezz.distudy.subcomp.ChildComponent;
import com.charlezz.distudy.subcomp.ChildModule;
import com.charlezz.distudy.subcomp.DaggerParentComponent;
import com.charlezz.distudy.subcomp.ParentComponent;

import org.junit.Test;

public class SubcomponentTest {

    @Test
    public void testSubComponent(){
        ParentComponent pComp = DaggerParentComponent.create();

        ChildComponent cComp = pComp.getChildComponentFactory().create(new ChildModule());

        System.out.println(cComp.getInteger());
        System.out.println(cComp.getLong());

        System.out.println("=====================");

        System.out.println(cComp.getInteger());
        System.out.println(cComp.getLong());


    }
}
