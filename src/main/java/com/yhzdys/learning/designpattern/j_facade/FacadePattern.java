package com.yhzdys.learning.designpattern.j_facade;

/**
 * 门面模式/外观模式 提供一个高层次的接口，使得子系统更易于使用
 * <p>
 * 对外提供简单的交互接口，隐藏内部的复杂性。
 */
public class FacadePattern {

    public static void main(String[] args) {
        ReportFacade facade = new ReportFacade();
        facade.printReport();
    }
}
