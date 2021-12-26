package com.yhzdys.learning.designpattern.t_visitor;

import com.yhzdys.learning.designpattern.t_visitor.comapny.Company;
import com.yhzdys.learning.designpattern.t_visitor.comapny.product.MiniApp;
import com.yhzdys.learning.designpattern.t_visitor.comapny.product.WebApp;

/**
 * 访问者模式
 * 封装一些作用于某种数据结构中的各元素的操作，它可以在不改变这个数据结构的前提下定义作用于其内部各个元素的新操作
 */
public class VisitorPattern {

    public static void main(String[] args) {
        Company company = new Company();

        company.buildProduct(new MiniApp());
        System.out.println("==============================");
        company.buildProduct(new WebApp());
    }
}
