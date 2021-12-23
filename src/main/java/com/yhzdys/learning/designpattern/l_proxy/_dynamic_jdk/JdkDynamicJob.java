package com.yhzdys.learning.designpattern.l_proxy._dynamic_jdk;

import com.yhzdys.learning.designpattern.l_proxy.job.Job;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkDynamicJob implements InvocationHandler {
    private final Job job;

    public JdkDynamicJob(Job job) {
        this.job = job;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equalsIgnoreCase("listen")) {
            System.out.println("boss say");
        }
        Object result = method.invoke(this.job, args);
        if (method.getName().equalsIgnoreCase("debug")) {
            System.out.println("boss happy");
        }
        return result;
    }
}
