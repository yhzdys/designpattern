package com.yhzdys.learning.designpattern.a_adstractfactory.factory;

import com.yhzdys.learning.designpattern.a_adstractfactory.product.computer.Computer;
import com.yhzdys.learning.designpattern.a_adstractfactory.product.computer.MsComputer;
import com.yhzdys.learning.designpattern.a_adstractfactory.product.mobilephone.AndroidPhone;
import com.yhzdys.learning.designpattern.a_adstractfactory.product.mobilephone.MobilePhone;

public class MiFactory implements com.yhzdys.learning.designpattern.a_adstractfactory.factory.AbstractFactory {

    @Override
    public Computer makeComputer() {
        return new MsComputer();
    }

    @Override
    public MobilePhone makeMobilePhone() {
        return new AndroidPhone();
    }
}
