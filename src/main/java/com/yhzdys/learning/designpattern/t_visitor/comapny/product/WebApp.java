package com.yhzdys.learning.designpattern.t_visitor.comapny.product;

import com.yhzdys.learning.designpattern.t_visitor.comapny.Programmer;
import com.yhzdys.learning.designpattern.t_visitor.comapny.Tester;

public class WebApp implements Visitor {
    @Override
    public void visit(Programmer programmer) {
        System.out.println("programmer develop web app");
    }

    @Override
    public void visit(Tester tester) {
        System.out.println("tester test web app");
    }
}
