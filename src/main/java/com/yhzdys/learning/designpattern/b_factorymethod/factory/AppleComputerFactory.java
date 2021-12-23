package com.yhzdys.learning.designpattern.b_factorymethod.factory;

import com.yhzdys.learning.designpattern.b_factorymethod.product.computer.Computer;
import com.yhzdys.learning.designpattern.b_factorymethod.product.computer.MacComputer;

public class AppleComputerFactory implements ComputerFactory {
    @Override
    public Computer makeComputer() {
        return new MacComputer();
    }
}
