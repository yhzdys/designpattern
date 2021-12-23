package com.yhzdys.learning.designpattern.g_bridge.product;

import com.yhzdys.learning.designpattern.g_bridge.product.ram.Ram;

public abstract class MobilePhone {
    private final Ram ram;

    public MobilePhone(Ram ram) {
        this.ram = ram;
    }
}
