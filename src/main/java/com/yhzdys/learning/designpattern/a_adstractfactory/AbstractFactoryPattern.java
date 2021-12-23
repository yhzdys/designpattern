package com.yhzdys.learning.designpattern.a_adstractfactory;

import com.yhzdys.learning.designpattern.a_adstractfactory.factory.AbstractFactory;
import com.yhzdys.learning.designpattern.a_adstractfactory.factory.AppleFactory;
import com.yhzdys.learning.designpattern.a_adstractfactory.factory.MiFactory;

/**
 * 抽象工厂为创建一组相关或者是相互依赖的对象提供一个接口，而不需要指定他们的具体类
 * <p>
 * 简单工厂方法与工厂方法创建工厂的着眼点为某类具体的产品，某个工厂与某个产品对应
 * 而抽象工厂某个工厂与产品的家族对应，这个工厂可以生产这个品牌家族的一系列产品。
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory apple = new AppleFactory();
        apple.makeComputer();
        apple.makeMobilePhone();

        AbstractFactory xiaomi = new MiFactory();
        xiaomi.makeComputer();
        xiaomi.makeMobilePhone();
    }

}
