package com.yhzdys.learning.designpattern.h_composite;

import com.yhzdys.learning.designpattern.h_composite.company.Company;
import com.yhzdys.learning.designpattern.h_composite.company.LeafDepartment;
import com.yhzdys.learning.designpattern.h_composite.company.OriginDepartment;

/**
 * 组合模式允许以相同的方式处理单个对象和对象的组合体
 * 当你的程序结构有类似树一样的层级关系时，例如文件系统，视图树，公司组织架构等等
 * 当你要以统一的方式操作单个对象和由这些对象组成的组合对象的时候。
 */
public class CompositePattern {

    public static void main(String[] args) {
        Company centerCompany = new Company("总公司");

        OriginDepartment itDepart = new OriginDepartment("IT部门");
        itDepart.add(new LeafDepartment("Java"));
        itDepart.add(new LeafDepartment("Golang"));
        itDepart.add(new LeafDepartment("HTML"));

        LeafDepartment HrDepart = new LeafDepartment("HR部门");
        LeafDepartment ProDepart = new LeafDepartment("Pro部门");

        centerCompany.add(itDepart);
        centerCompany.add(HrDepart);
        centerCompany.add(ProDepart);
    }

}
