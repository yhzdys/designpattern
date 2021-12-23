package com.yhzdys.learning.designpattern.j_facade;

import com.yhzdys.learning.designpattern.j_facade.mall.ExpressSystem;
import com.yhzdys.learning.designpattern.j_facade.mall.OrderSystem;
import com.yhzdys.learning.designpattern.j_facade.mall.PaySystem;

public class ReportFacade {

    public void printReport() {
        OrderSystem orderSystem = new OrderSystem();
        PaySystem paySystem = new PaySystem(orderSystem);
        ExpressSystem expressSystem = new ExpressSystem();

        System.out.println(
                "os:" + orderSystem.getOrderNo() + " & " +
                        "ps:" + paySystem.getPayment(orderSystem.getOrderNo()) + " & " +
                        "es:" + expressSystem.getSendTime()
        );
    }


}
