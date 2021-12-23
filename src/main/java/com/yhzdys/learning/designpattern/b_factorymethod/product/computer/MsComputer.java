package com.yhzdys.learning.designpattern.b_factorymethod.product.computer;

public class MsComputer extends Computer {
    @Override
    public void installOS() {
        System.out.println("install Windows OS");
    }
}
