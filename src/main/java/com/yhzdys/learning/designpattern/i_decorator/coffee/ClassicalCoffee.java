package com.yhzdys.learning.designpattern.i_decorator.coffee;

public class ClassicalCoffee implements Coffee {

    @Override
    public void make() {
        System.out.print("原味咖啡");
    }
}
