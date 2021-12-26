package com.yhzdys.learning.designpattern.s_observer.demo;

public class ObserverA extends Observer {

    public ObserverA(Subject subject) {
        super(subject);
        subject.addObserver(this);
    }

    @Override
    public void receive() {
        System.out.println("observerA receive subject notify");
    }
}
