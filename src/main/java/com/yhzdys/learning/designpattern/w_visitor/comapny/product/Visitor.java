package com.yhzdys.learning.designpattern.w_visitor.comapny.product;

import com.yhzdys.learning.designpattern.w_visitor.comapny.Programmer;
import com.yhzdys.learning.designpattern.w_visitor.comapny.Tester;

public interface Visitor {

    void visit(Programmer programmer);

    void visit(Tester tester);
}
