package com.project.zfz.aop.jdk.demo;

public class Client {

    public static void main(String[] args) {
        Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
        greeting.sayHello("Jack");
        
        //JDK动态代理，只能对接口进行代理，不能代理普通类，以下为反例
        Greeting greetingTest = new JDKDynamicProxy(new GreetingTest()).getProxy();
        greetingTest.sayHello("Rose");
    }
}