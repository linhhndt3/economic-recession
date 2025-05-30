package com.companyA.service;

// facade & mediator
public abstract class Checkable {

    public void check(String s) {
        System.out.println("my name is " + getName());
        System.out.println(s + " is start with s is " + isStartWithS(s));
    }
    abstract String getName();
    abstract boolean isStartWithS(String name);
}
