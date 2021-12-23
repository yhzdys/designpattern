package com.yhzdys.learning.designpattern.l_proxy;

import com.yhzdys.learning.designpattern.l_proxy._dynamic_cglib.CglibDynamicJobProxy;
import com.yhzdys.learning.designpattern.l_proxy._dynamic_jdk.JdkDynamicJobProxy;
import com.yhzdys.learning.designpattern.l_proxy._static.StaticJobProxy;
import com.yhzdys.learning.designpattern.l_proxy.job.CoderJob;
import com.yhzdys.learning.designpattern.l_proxy.job.Job;

/**
 * 为其他对象提供一种代理以控制对这个对象的访问
 */
public class ProxyPattern {

    public static void main(String[] args) {
        Job staticProxy = StaticJobProxy.getJobProxy();
        staticProxy.listen();
        staticProxy.coding();
        staticProxy.debug();

        System.out.println("==============================");

        Job jdkProxy = JdkDynamicJobProxy.getJobProxy(new CoderJob());
        jdkProxy.listen();
        jdkProxy.coding();
        jdkProxy.debug();
        System.out.println(jdkProxy.getClass().getName());

        System.out.println("==============================");
        com.yhzdys.learning.designpattern.l_proxy._dynamic_cglib.CoderJob cglibProxy =
                CglibDynamicJobProxy.getJobProxy(new com.yhzdys.learning.designpattern.l_proxy._dynamic_cglib.CoderJob());
        cglibProxy.listen();
        cglibProxy.coding();
        cglibProxy.debug();
        System.out.println(cglibProxy.getClass().getName());
    }
}
