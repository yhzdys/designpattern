package com.yhzdys.learning.designpattern.m_chainofresponsibility.company;

public class Leader implements Staff {
    private Staff nextStaff;

    @Override
    public void setNextLevel(Staff staff) {
        this.nextStaff = staff;
    }

    @Override
    public boolean handle(int amount) {
        if (amount < 1000) {
            System.out.println("leader can load 1000 amount");
            return true;
        }
        System.out.println("leader can not load 1000 amount");
        if (nextStaff != null) {
            return this.nextStaff.handle(amount);
        }
        return false;
    }
}
