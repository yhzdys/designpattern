package com.yhzdys.learning.designpattern.t_strategy.order;

public interface OrderFeeCalculator {

    int calculate(int fee, int num);
}
