package com.yhzdys.learning.designpattern.v_templatemethod;

import com.yhzdys.learning.designpattern.v_templatemethod.pay.AliPay;
import com.yhzdys.learning.designpattern.v_templatemethod.pay.WechatPay;

/**
 * 模版方法模式
 * 在一个方法中定义一个算法的骨架，而将一些步骤的实现延迟到子类中，使得子类可以在不改变一个算法的结构前提下即可重定义该算法的某些特定步骤
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {
        WechatPay wechatPay = new WechatPay();
        AliPay aliPay = new AliPay();

        wechatPay.pay();
        System.out.println("==============================");
        aliPay.pay();
    }

}
