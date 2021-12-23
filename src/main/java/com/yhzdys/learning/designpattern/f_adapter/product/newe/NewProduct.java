package com.yhzdys.learning.designpattern.f_adapter.product.newe;

public class NewProduct implements NewInterface {

    @Override
    public void output(String pattern, String contents) {
        System.out.println(pattern + contents);
    }
}
