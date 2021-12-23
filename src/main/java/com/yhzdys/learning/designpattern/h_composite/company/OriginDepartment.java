package com.yhzdys.learning.designpattern.h_composite.company;

import java.util.ArrayList;
import java.util.List;

public class OriginDepartment extends Department {
    private final List<Department> departments = new ArrayList<>();

    public OriginDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Department department) {
        this.departments.add(department);
    }

    @Override
    public Department getChild(String name) {
        for (Department depart : this.departments) {
            if (name.equals(depart.getName())) return depart;
        }
        return null;
    }

    @Override
    public int getCount() {
        return this.departments.size();
    }
}
