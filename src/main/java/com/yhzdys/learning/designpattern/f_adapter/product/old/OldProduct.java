package com.yhzdys.learning.designpattern.f_adapter.product.old;

public class OldProduct implements OldInterface {
    @Override
    public void say(String content) {
        System.out.println(content);
    }
}
