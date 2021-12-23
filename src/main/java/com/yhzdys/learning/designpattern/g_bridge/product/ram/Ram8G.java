package com.yhzdys.learning.designpattern.g_bridge.product.ram;

public class Ram8G implements Ram {
    @Override
    public void add() {
        System.out.println("8G RAM");
    }
}
