package com.companyA.service.impl;

import com.companyA.service.CheckableIdentity;

public class DeveloperC extends CheckableIdentity {
    @Override
    public String getEmployeeId() {
        return "developer C";
    }

    @Override
    public Boolean isStartWithS(String name) {
        return null;
    }
}
