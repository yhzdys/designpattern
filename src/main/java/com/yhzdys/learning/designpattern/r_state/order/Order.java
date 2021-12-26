package com.yhzdys.learning.designpattern.r_state.order;

public class Order {
    private Long orderId = 123L;
    private String state = OrderState.CREATE.name();

    public void changeOrderState(OrderState orderState) {
        if (OrderState.FINISH.name().equalsIgnoreCase(this.state)) {
            System.out.println("order state can not change");
            return;
        }
        this.state = orderState.name();
        System.out.println("order state:" + this.state);
    }
}
