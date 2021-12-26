package com.yhzdys.learning.designpattern.t_visitor.comapny.product;

import com.yhzdys.learning.designpattern.t_visitor.comapny.Programmer;
import com.yhzdys.learning.designpattern.t_visitor.comapny.Tester;

public interface Visitor {

    void visit(Programmer programmer);

    void visit(Tester tester);
}
