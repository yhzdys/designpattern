package com.yhzdys.learning.designpattern.m_chainofresponsibility;

import com.yhzdys.learning.designpattern.m_chainofresponsibility.company.Boss;
import com.yhzdys.learning.designpattern.m_chainofresponsibility.company.CFO;
import com.yhzdys.learning.designpattern.m_chainofresponsibility.company.Leader;

/**
 * 责任链模式
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止
 */
public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {
        Leader leader = new Leader();
        CFO cfo = new CFO();
        Boss boss = new Boss();

        leader.setNextLevel(cfo);
        cfo.setNextLevel(boss);
        boss.setNextLevel(null);

        if (leader.handle(12000)) {
            System.out.println("ok");
        } else {
            System.out.println("no!");
        }
    }
}
