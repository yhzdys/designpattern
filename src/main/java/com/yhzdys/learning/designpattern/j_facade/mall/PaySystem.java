package com.yhzdys.learning.designpattern.j_facade.mall;

public class PaySystem {
    private final OrderSystem orderSystem;

    public PaySystem(OrderSystem orderSystem) {
        this.orderSystem = orderSystem;
    }

    public Long getPayment(String orderNum) {
        return 123L;
    }
}
