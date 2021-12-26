package com.yhzdys.learning.designpattern.s_observer.demo;

public abstract class Observer {
    private Subject subject;

    public abstract void receive();

    public Observer(Subject subject) {
        this.subject = subject;
    }
}
