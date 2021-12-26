package com.yhzdys.learning.designpattern.s_templatemethod.pay;

public abstract class PayAction {

    public int calculateFee() {
        System.out.println("calculate order fee: " + 100);
        return 100;
    }

    public abstract boolean pay();

    public void finish() {
        System.out.println("order pay finish");
    }

}
