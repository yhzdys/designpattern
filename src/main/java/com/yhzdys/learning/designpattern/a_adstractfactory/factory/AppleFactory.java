package com.yhzdys.learning.designpattern.a_adstractfactory.factory;

import com.yhzdys.learning.designpattern.a_adstractfactory.product.computer.Computer;
import com.yhzdys.learning.designpattern.a_adstractfactory.product.computer.MacComputer;
import com.yhzdys.learning.designpattern.a_adstractfactory.product.mobilephone.IPhone;
import com.yhzdys.learning.designpattern.a_adstractfactory.product.mobilephone.MobilePhone;

public class AppleFactory implements com.yhzdys.learning.designpattern.a_adstractfactory.factory.AbstractFactory {

    @Override
    public Computer makeComputer() {
        return new MacComputer();
    }

    @Override
    public MobilePhone makeMobilePhone() {
        return new IPhone();
    }
}
