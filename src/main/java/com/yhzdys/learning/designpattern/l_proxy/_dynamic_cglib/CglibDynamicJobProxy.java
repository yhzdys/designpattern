package com.yhzdys.learning.designpattern.l_proxy._dynamic_cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibDynamicJobProxy {

    public static CoderJob getJobProxy(Object job) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(job.getClass());
        enhancer.setCallback(new CglibDynamicJob());
        return (CoderJob) enhancer.create();
    }
}
