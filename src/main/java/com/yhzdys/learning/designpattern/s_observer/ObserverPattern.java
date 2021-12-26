package com.yhzdys.learning.designpattern.s_observer;

import com.yhzdys.learning.designpattern.s_observer.demo.ObserverA;
import com.yhzdys.learning.designpattern.s_observer.demo.ObserverB;
import com.yhzdys.learning.designpattern.s_observer.demo.Subject;

/**
 * 观察者模式
 * 当对象间存在一对多关系时，则使用观察者模式。
 * 比如，当一个对象被修改时，则会自动通知依赖它的对象。观察者模式属于行为型模式。
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new Subject();
        ObserverA observerA = new ObserverA(subject);
        ObserverB observerB = new ObserverB(subject);

        subject.change();
    }
}
