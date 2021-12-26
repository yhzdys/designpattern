package com.yhzdys.learning.designpattern.u_state;

import com.yhzdys.learning.designpattern.u_state.order.Order;
import com.yhzdys.learning.designpattern.u_state.order.OrderState;

/**
 * 状态模式
 * 当一个对象内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 */
public class StatePattern {

    public static void main(String[] args) {
        Order order = new Order();
        order.changeOrderState(OrderState.PAY);
        order.changeOrderState(OrderState.FINISH);
        order.changeOrderState(OrderState.CANCEL);
    }

}
