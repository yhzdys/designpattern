package com.yhzdys.learning.designpattern.s_templatemethod.pay;

public class AliPay extends PayAction {
    @Override
    public boolean pay() {
        System.out.println("call ali pay api success");
        return true;
    }
}
