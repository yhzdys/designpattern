package com.yhzdys.learning.designpattern.w_visitor.comapny;

import com.yhzdys.learning.designpattern.w_visitor.comapny.product.Visitor;

public class Programmer implements Staff {
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
