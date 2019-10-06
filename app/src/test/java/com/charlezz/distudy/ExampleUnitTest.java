package com.charlezz.distudy;

import com.charlezz.distudy.why.AMDCpu;
import com.charlezz.distudy.why.Computer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void AMDCPU_주입확인(){
        Computer computer = new Computer(new AMDCpu());
        Assert.assertNotNull(computer.getCpu());

    }
}