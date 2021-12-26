package com.yhzdys.learning.designpattern.q_mediator;

/**
 * 中介者模式
 * 提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
 */
public class MediatorPattern {

    public static void main(String[] args) {
        User zs = new User("张三");
        User ls = new User("李四");

        RoomMediator.sendMessage(zs, "hello");
        RoomMediator.sendMessage(ls, "yeah");
    }

}
