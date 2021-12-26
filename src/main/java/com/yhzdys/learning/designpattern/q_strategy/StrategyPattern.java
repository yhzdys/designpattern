package com.yhzdys.learning.designpattern.q_strategy;

import com.yhzdys.learning.designpattern.q_strategy.order.NormalOrderCalculator;
import com.yhzdys.learning.designpattern.q_strategy.order.PromotionOrderCalculator;

/**
 * 策略模式定义了一系列的算法，并将每一个算法封装起来，使他们可以相互替换。
 */
public class StrategyPattern {

    public static void main(String[] args) {
        NormalOrderCalculator normalOrderCalculator = new NormalOrderCalculator();
        PromotionOrderCalculator promotionOrderCalculator = new PromotionOrderCalculator();

        int fee = 100, num = 2;
        System.out.println(normalOrderCalculator.calculate(fee, num));
        System.out.println(promotionOrderCalculator.calculate(fee, num));
    }

}
