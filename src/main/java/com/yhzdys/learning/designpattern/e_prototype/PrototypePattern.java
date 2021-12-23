package com.yhzdys.learning.designpattern.e_prototype;

import com.yhzdys.learning.designpattern.e_prototype.product.IPhoneX;

import java.util.List;

/**
 * 使用原型实例指定待创建对象的类型，并且通过复制这个原型来创建新的对象。
 */
public class PrototypePattern {

    public static void main(String[] args) {
        IPhoneX iPhoneX = new IPhoneX();
        iPhoneX.design();

        System.out.println(iPhoneX.getParts());

        IPhoneX mi8 = ((IPhoneX) iPhoneX.copy());
        List<String> parts = mi8.getParts();
        parts.add("Mi logo");

        System.out.println(mi8.getParts());
    }
}
