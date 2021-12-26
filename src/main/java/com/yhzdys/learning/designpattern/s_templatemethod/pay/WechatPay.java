package com.yhzdys.learning.designpattern.s_templatemethod.pay;

public class WechatPay extends PayAction {

    @Override
    public boolean pay() {
        System.out.println("call wechat pay api success");
        return true;
    }
}
