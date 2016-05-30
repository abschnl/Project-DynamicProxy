/**
 * Project Name:Project-DynamicProxy
 * File Name:CGLibDynamicProxy.java
 * Package Name:com.project.zfz.aop.cglib.demo
 * Date:2016年5月30日上午9:53:10
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 *
*/

package com.project.zfz.aop.cglib.demo;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * ClassName:CGLibDynamicProxy <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年5月30日 上午9:53:10 <br/>
 * @author   ZFZ
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class CGLibDynamicProxy implements MethodInterceptor{

    private static CGLibDynamicProxy instance = new CGLibDynamicProxy();
    
    private CGLibDynamicProxy() {
    }
    
    // Singleton 单利方式
    public static CGLibDynamicProxy getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }
    
    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        
        befor();
        // 调用代理类实例上的proxy方法的父类方法
        Object result = proxy.invokeSuper(target, args);
        after();
        return result;
    }
    
    private void befor(){
        System.out.println("Before");
    }
    
    private void after(){
        System.out.println("After");
    }
    

}

