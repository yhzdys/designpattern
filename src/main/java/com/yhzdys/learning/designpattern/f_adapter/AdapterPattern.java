package com.yhzdys.learning.designpattern.f_adapter;

import com.yhzdys.learning.designpattern.f_adapter.product.newe.NewAdapter;
import com.yhzdys.learning.designpattern.f_adapter.product.newe.NewProduct;
import com.yhzdys.learning.designpattern.f_adapter.product.old.OldInterface;
import com.yhzdys.learning.designpattern.f_adapter.product.old.OldProduct;

/**
 * 将一个接口转换为客户端所期待的接口，从而使两个接口不兼容的类可以在一起工作
 */
public class AdapterPattern {

    public static void main(String[] args) {

        OldInterface oldProduct = new OldProduct();
        oldProduct.say("old hello");

        OldInterface newProduct = new NewAdapter(new NewProduct());
        newProduct.say("new hello");
    }
}
