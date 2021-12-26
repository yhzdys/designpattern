package com.yhzdys.learning.designpattern.w_visitor.comapny;

import com.yhzdys.learning.designpattern.w_visitor.comapny.product.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Staff> staffs = new ArrayList<>();

    public Company() {
        this.staffs.add(new Programmer("张三"));
        this.staffs.add(new Tester("李四"));
    }

    public void buildProduct(Visitor visitor) {
        this.staffs.forEach(staff -> staff.accept(visitor));
    }
}
