package com.yhzdys.learning.designpattern.b_factorymethod.product.mobilephone;

public class IPhone extends MobilePhone {
    @Override
    public void installOS() {
        System.out.println("install iOS");
    }
}
