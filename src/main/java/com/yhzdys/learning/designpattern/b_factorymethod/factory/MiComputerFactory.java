package com.yhzdys.learning.designpattern.b_factorymethod.factory;

import com.yhzdys.learning.designpattern.b_factorymethod.product.computer.Computer;
import com.yhzdys.learning.designpattern.b_factorymethod.product.computer.MsComputer;

public class MiComputerFactory implements ComputerFactory {
    @Override
    public Computer makeComputer() {
        return new MsComputer();
    }
}
