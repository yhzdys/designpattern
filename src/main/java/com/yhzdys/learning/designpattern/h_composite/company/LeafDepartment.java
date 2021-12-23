package com.yhzdys.learning.designpattern.h_composite.company;

/**
 * 集团-公司-最底层部门
 */
public class LeafDepartment extends Department {

    public LeafDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Department department) {
        System.out.println("can not add");
    }

    @Override
    public Department getChild(String name) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
