package com.yhzdys.learning.designpattern.a_adstractfactory.factory;

import com.yhzdys.learning.designpattern.a_adstractfactory.product.computer.Computer;
import com.yhzdys.learning.designpattern.a_adstractfactory.product.mobilephone.MobilePhone;

public interface AbstractFactory {

    Computer makeComputer();

    MobilePhone makeMobilePhone();
}
