package com.yhzdys.learning.designpattern.i_decorator.coffee;

public class SugarCoffeeDecorator extends CoffeeDecorator {

    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void make() {
        super.make();
        addSugar();
    }

    private void addSugar() {
        System.out.println(" add sugar");
    }
}
