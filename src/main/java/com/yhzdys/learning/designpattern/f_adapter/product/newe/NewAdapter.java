package com.yhzdys.learning.designpattern.f_adapter.product.newe;

import com.yhzdys.learning.designpattern.f_adapter.product.old.OldInterface;

public class NewAdapter implements OldInterface {
    private final NewProduct newProduct;

    public NewAdapter(NewProduct newProduct) {
        this.newProduct = newProduct;
    }

    @Override
    public void say(String content) {
        this.newProduct.output(content, "");
    }
}
