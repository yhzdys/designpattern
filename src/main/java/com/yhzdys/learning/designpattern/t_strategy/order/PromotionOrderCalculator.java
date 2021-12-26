package com.yhzdys.learning.designpattern.t_strategy.order;

public class PromotionOrderCalculator implements OrderFeeCalculator {
    @Override
    public int calculate(int fee, int num) {
        return fee * num / 5 * 2;
    }
}
