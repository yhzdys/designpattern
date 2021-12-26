package com.yhzdys.learning.designpattern.s_observer.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void change() {
        for (Observer observer : this.observers) {
            observer.receive();
        }
    }
}
