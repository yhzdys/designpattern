package com.yhzdys.learning.designpattern.v_templatemethod.pay;

public class WechatPay extends PayAction {

    @Override
    public boolean pay() {
        System.out.println("call wechat pay api success");
        return true;
    }
}
