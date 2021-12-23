package com.yhzdys.learning.designpattern.d_singleton.hungry;

import com.yhzdys.learning.designpattern.d_singleton.SingleObject;

public class HungryInstance {
    private static final SingleObject _instance = new SingleObject();

    public static SingleObject getInstance() {
        return _instance;
    }

    private HungryInstance() {
    }
}
