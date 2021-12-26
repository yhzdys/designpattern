package com.yhzdys.learning.designpattern.t_visitor.comapny;

import com.yhzdys.learning.designpattern.t_visitor.comapny.product.Visitor;

public class Tester implements Staff {
    private String name;

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
