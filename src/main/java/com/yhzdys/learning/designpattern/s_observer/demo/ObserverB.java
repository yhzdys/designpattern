package com.yhzdys.learning.designpattern.s_observer.demo;

public class ObserverB extends Observer {

    public ObserverB(Subject subject) {
        super(subject);
        subject.addObserver(this);
    }

    @Override
    public void receive() {
        System.out.println("observerB receive subject notify");
    }
}
