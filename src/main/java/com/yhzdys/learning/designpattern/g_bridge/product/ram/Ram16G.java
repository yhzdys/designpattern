package com.yhzdys.learning.designpattern.g_bridge.product.ram;

public class Ram16G implements Ram {
    @Override
    public void add() {
        System.out.println("16G RAM");
    }
}
