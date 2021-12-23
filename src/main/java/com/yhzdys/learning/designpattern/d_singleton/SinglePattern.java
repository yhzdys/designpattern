package com.yhzdys.learning.designpattern.d_singleton;

import com.yhzdys.learning.designpattern.d_singleton.hungry.HungryInstance;
import com.yhzdys.learning.designpattern.d_singleton.lazy.LazyInstance;
import com.yhzdys.learning.designpattern.d_singleton.meijv.SingletonEnum;

/**
 * 某个类只有一个实例，且自行实例化并向整个系统提供此实例
 * <p>
 * 写法：1.静态常量 2.DCL 3.枚举
 */
public class SinglePattern {

    public static void main(String[] args) {
        SingleObject hungry = HungryInstance.getInstance();
        SingleObject lazy = LazyInstance.getInstance();
        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.haha();
    }
}
