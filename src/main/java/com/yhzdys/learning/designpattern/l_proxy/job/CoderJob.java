package com.yhzdys.learning.designpattern.l_proxy.job;

public class CoderJob implements Job {

    @Override
    public void listen() {
        System.out.println("coder listen");
    }

    @Override
    public void coding() {
        System.out.println("coder coding");
    }

    @Override
    public void debug() {
        System.out.println("coder debug");
    }
}
