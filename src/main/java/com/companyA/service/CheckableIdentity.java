package com.companyA.service;

// facade & mediator
public abstract class CheckableIdentity {

    public void check(String s) {
        System.out.println("my id is " + getEmployeeId());
        System.out.println(s + " is start with s is " + isStartWithS(s));
    }

    abstract public String getEmployeeId();
    abstract public Boolean isStartWithS(String name);
}
