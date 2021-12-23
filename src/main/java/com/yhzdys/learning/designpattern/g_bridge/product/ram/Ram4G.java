package com.yhzdys.learning.designpattern.g_bridge.product.ram;

public class Ram4G implements Ram {
    @Override
    public void add() {
        System.out.println("4G RAM");
    }
}
