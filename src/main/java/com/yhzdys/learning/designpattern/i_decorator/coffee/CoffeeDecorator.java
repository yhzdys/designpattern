package com.yhzdys.learning.designpattern.i_decorator.coffee;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void make() {
        coffee.make();
    }
}
