package com.yhzdys.learning.designpattern.i_decorator.coffee;

public class MilkCoffeeDecorator extends CoffeeDecorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void make() {
        super.make();
        addMilk();
    }

    private void addMilk() {
        System.out.println(" add milk");
    }
}
