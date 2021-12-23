package com.yhzdys.learning.designpattern.l_proxy._dynamic_cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicJob implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equalsIgnoreCase("listen")) {
            System.out.println("boss say");
        }
        Object result = methodProxy.invokeSuper(o, objects);
        if (method.getName().equalsIgnoreCase("debug")) {
            System.out.println("boss happy");
        }
        return result;
    }
}
