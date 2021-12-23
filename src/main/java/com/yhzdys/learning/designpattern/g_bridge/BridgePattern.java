package com.yhzdys.learning.designpattern.g_bridge;

import com.yhzdys.learning.designpattern.g_bridge.product.MobilePhone;
import com.yhzdys.learning.designpattern.g_bridge.product.MobilePhone128G;
import com.yhzdys.learning.designpattern.g_bridge.product.MobilePhone64G;
import com.yhzdys.learning.designpattern.g_bridge.product.ram.Ram4G;
import com.yhzdys.learning.designpattern.g_bridge.product.ram.Ram8G;

/**
 * 桥接模式是将抽象部分与它的实现部分分离，使它们都可以独立地变化
 * 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 */
public class BridgePattern {

    public static void main(String[] args) {
        MobilePhone model4_64 = new MobilePhone64G(new Ram4G());
        MobilePhone model4_128 = new MobilePhone128G(new Ram4G());
        MobilePhone model8_128 = new MobilePhone128G(new Ram8G());
    }

}
