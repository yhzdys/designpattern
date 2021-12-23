package com.yhzdys.learning.designpattern.i_decorator;

import com.yhzdys.learning.designpattern.i_decorator.coffee.ClassicalCoffee;
import com.yhzdys.learning.designpattern.i_decorator.coffee.Coffee;
import com.yhzdys.learning.designpattern.i_decorator.coffee.MilkCoffeeDecorator;
import com.yhzdys.learning.designpattern.i_decorator.coffee.SugarCoffeeDecorator;

/**
 * 装饰模式是在不必改变原类和使用继承的情况下，动态地扩展一个对象的功能。
 * 它是通过创建一个包装对象，也就是装饰来包裹真实的对象
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Coffee coffee1 = new ClassicalCoffee();

        coffee1 = new MilkCoffeeDecorator(coffee1);
        coffee1.make();

        Coffee coffee2 = new ClassicalCoffee();
        coffee2 = new SugarCoffeeDecorator(coffee2);
        coffee2.make();
    }
}
