package com.yhzdys.learning.designpattern.b_factorymethod.factory;

import com.yhzdys.learning.designpattern.b_factorymethod.product.mobilephone.IPhone;
import com.yhzdys.learning.designpattern.b_factorymethod.product.mobilephone.MobilePhone;

public class AppleMobilePhoneFactory implements MobilePhoneFactory {
    @Override
    public MobilePhone makeMobilePhone() {
        return new IPhone();
    }
}
