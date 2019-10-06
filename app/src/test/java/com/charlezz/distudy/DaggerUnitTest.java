package com.charlezz.distudy;

import com.charlezz.distudy.how.Computer;
import com.charlezz.distudy.how.Cpu;
import com.charlezz.distudy.how.di.ComputerComponent;
import com.charlezz.distudy.how.di.DaggerComputerComponent;

import org.junit.Assert;
import org.junit.Test;

public class DaggerUnitTest {

    @Test
    public void CPU_주입하기_첫_테스트_대거사용(){
        ComputerComponent component = DaggerComputerComponent.create();
        Cpu cpu = component.getCpu();
        Computer computer = new Computer(cpu);

        Assert.assertNotNull(computer.getCpu());
    }

    @Test
    public void 생성자_인젝션_테스트(){
        ComputerComponent component = DaggerComputerComponent.create();
        Computer computer = component.getComputer();
        Assert.assertNotNull(computer.getCpu());
    }

    @Test
    public void 필드_인젝션_테스트(){
        ComputerComponent component = DaggerComputerComponent.create();
        Computer computer = new Computer();

        component.inject(computer);

        Assert.assertNotNull(computer.getCpu());
    }

    @Test
    public void 메소드_인젝션_테스트(){
        ComputerComponent component = DaggerComputerComponent.create();
        Computer computer = new Computer();

        component.inject(computer);

        Assert.assertNotNull(computer.getCpu());
    }

    @Test
    public void 컴포넌트_수동으로_만들기(){
    }
}
