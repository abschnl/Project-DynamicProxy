package com.project.zfz.aop.demo;

public class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }
}