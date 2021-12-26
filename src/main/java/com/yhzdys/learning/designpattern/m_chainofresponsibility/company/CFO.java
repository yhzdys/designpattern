package com.yhzdys.learning.designpattern.m_chainofresponsibility.company;

public class CFO implements Staff {

    private Staff nextStaff;

    @Override
    public void setNextLevel(Staff staff) {
        this.nextStaff = staff;
    }

    @Override
    public boolean handle(int amount) {
        if (amount < 5000) {
            System.out.println("CFO can load 5000 amount");
            return true;
        }
        System.out.println("CFO can not load 5000 amount");
        if (nextStaff != null) {
            return this.nextStaff.handle(amount);
        }
        return false;
    }
}
