package com.yhzdys.learning.designpattern.d_singleton.lazy;

import com.yhzdys.learning.designpattern.d_singleton.SingleObject;

public class LazyInstance {
    private static volatile SingleObject _instance = null;

    public static SingleObject getInstance() {
        if (_instance != null) return _instance;

        synchronized (LazyInstance.class) {
            if (_instance != null) return _instance;
            _instance = new SingleObject();
        }
        return _instance;
    }

    private LazyInstance() {
    }
}
