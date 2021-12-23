package com.yhzdys.learning.designpattern.b_factorymethod;

import com.yhzdys.learning.designpattern.b_factorymethod.factory.AppleComputerFactory;
import com.yhzdys.learning.designpattern.b_factorymethod.factory.AppleMobilePhoneFactory;
import com.yhzdys.learning.designpattern.b_factorymethod.factory.ComputerFactory;
import com.yhzdys.learning.designpattern.b_factorymethod.factory.MiComputerFactory;
import com.yhzdys.learning.designpattern.b_factorymethod.factory.MiMobilePhoneFactory;
import com.yhzdys.learning.designpattern.b_factorymethod.factory.MobilePhoneFactory;

/**
 * 定义一个用于创建对象的接口，让子类决定实例化哪个类
 * <p>
 * 每个工厂只生产一种特定的产品。
 */
public class FactoryMethodPattern {

    public static void main(String[] args) {
        ComputerFactory appleC = new AppleComputerFactory();
        appleC.makeComputer();
        ComputerFactory xiaomiC = new MiComputerFactory();
        xiaomiC.makeComputer();

        MobilePhoneFactory appleM = new AppleMobilePhoneFactory();
        appleM.makeMobilePhone();
        MobilePhoneFactory xiaomiM = new MiMobilePhoneFactory();
        xiaomiM.makeMobilePhone();
    }

}
