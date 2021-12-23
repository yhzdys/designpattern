package com.yhzdys.learning.designpattern.l_proxy._static;

import com.yhzdys.learning.designpattern.l_proxy.job.Job;

public class BossJob implements Job {
    private final Job job;

    public BossJob(Job job) {
        this.job = job;
    }

    @Override
    public void listen() {
        System.out.println("boss say");
        job.listen();
    }

    @Override
    public void coding() {
        job.coding();
    }

    @Override
    public void debug() {
        job.debug();
        System.out.println("boss happy");
    }
}
