package com.yhzdys.learning.designpattern.m_chainofresponsibility.company;

public class Boss implements Staff {
    private Staff nextStaff;

    @Override
    public void setNextLevel(Staff staff) {
        this.nextStaff = staff;
    }

    @Override
    public boolean handle(int amount) {
        if (amount < 10000) {
            System.out.println("Boss can load 10000 amount");
            return true;
        }
        System.out.println("Boss can not load 10000 amount");
        if (nextStaff != null) {
            return this.nextStaff.handle(amount);
        }
        return false;
    }
}
