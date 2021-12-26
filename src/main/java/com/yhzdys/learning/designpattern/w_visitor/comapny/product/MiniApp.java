package com.yhzdys.learning.designpattern.w_visitor.comapny.product;

import com.yhzdys.learning.designpattern.w_visitor.comapny.Programmer;
import com.yhzdys.learning.designpattern.w_visitor.comapny.Tester;

public class MiniApp implements Visitor{
    @Override
    public void visit(Programmer programmer) {
        System.out.println("programmer develop mini app");
    }

    @Override
    public void visit(Tester tester) {
        System.out.println("tester test mini app");
    }
}
