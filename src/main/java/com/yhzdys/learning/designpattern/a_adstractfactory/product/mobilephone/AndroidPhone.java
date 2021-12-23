package com.yhzdys.learning.designpattern.a_adstractfactory.product.mobilephone;

public class AndroidPhone extends com.yhzdys.learning.designpattern.a_adstractfactory.product.mobilephone.MobilePhone {
    @Override
    public void installOS() {
        System.out.println("install Android OS");
    }
}
