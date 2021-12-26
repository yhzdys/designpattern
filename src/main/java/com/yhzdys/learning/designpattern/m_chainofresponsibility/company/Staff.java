package com.yhzdys.learning.designpattern.m_chainofresponsibility.company;

public interface Staff {

    void setNextLevel(Staff staff);

    boolean handle(int amount);
}
