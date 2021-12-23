package com.yhzdys.learning.designpattern.a_adstractfactory.product.computer;

public class MsComputer extends com.yhzdys.learning.designpattern.a_adstractfactory.product.computer.Computer {
    @Override
    public void installOS() {
        System.out.println("install Windows OS");
    }
}
