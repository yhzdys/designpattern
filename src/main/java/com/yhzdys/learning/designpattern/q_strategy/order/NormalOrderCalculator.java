package com.yhzdys.learning.designpattern.q_strategy.order;

public class NormalOrderCalculator implements OrderFeeCalculator {
    @Override
    public int calculate(int fee, int num) {
        return fee * num;
    }
}
