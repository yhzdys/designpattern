package com.yhzdys.learning.designpattern.t_visitor.comapny;

import com.yhzdys.learning.designpattern.t_visitor.comapny.product.Visitor;

public interface Staff {

    void accept(Visitor visitor);
}
