package com.yhzdys.learning.designpattern.q_strategy.order;

public interface OrderFeeCalculator {

    int calculate(int fee, int num);
}
