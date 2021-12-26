package com.yhzdys.learning.designpattern.w_visitor.comapny;

import com.yhzdys.learning.designpattern.w_visitor.comapny.product.Visitor;

public interface Staff {

    void accept(Visitor visitor);
}
