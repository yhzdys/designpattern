package com.yhzdys.learning.designpattern.h_composite.company;

/**
 * 基础部门
 */
public abstract class Department {
    private final String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void add(Department department);

    public abstract Department getChild(String name);

    public abstract int getCount();

}
