package com.yhzdys.learning.designpattern.b_factorymethod.factory;

import com.yhzdys.learning.designpattern.b_factorymethod.product.mobilephone.AndroidPhone;
import com.yhzdys.learning.designpattern.b_factorymethod.product.mobilephone.MobilePhone;

public class MiMobilePhoneFactory implements MobilePhoneFactory {
    @Override
    public MobilePhone makeMobilePhone() {
        return new AndroidPhone();
    }
}
