package com.yhzdys.learning.designpattern.l_proxy._dynamic_jdk;

import com.yhzdys.learning.designpattern.l_proxy.job.Job;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkDynamicJobProxy {

    public static Job getJobProxy(Job job) {
        InvocationHandler handler = new JdkDynamicJob(job);
        return (Job) Proxy.newProxyInstance(job.getClass().getClassLoader(), job.getClass().getInterfaces(), handler);
    }
}
