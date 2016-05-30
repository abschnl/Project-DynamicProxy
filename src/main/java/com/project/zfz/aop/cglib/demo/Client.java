/**
 * Project Name:Project-DynamicProxy
 * File Name:Client.java
 * Package Name:com.project.zfz.aop.cglib.demo
 * Date:2016年5月30日下午3:31:22
 * Copyright (c) 2016, duiba.com.cn All Rights Reserved.
 *
*/

package com.project.zfz.aop.cglib.demo;

/**
 * ClassName:Client <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年5月30日 下午3:31:22 <br/>
 * @author   ZFZ
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Client {
    public static void main(String[] args) {
        Greeting greeting = CGLibDynamicProxy.getInstance().getProxy(Greeting.class);
        greeting.sayHello("hello");
    }
}

