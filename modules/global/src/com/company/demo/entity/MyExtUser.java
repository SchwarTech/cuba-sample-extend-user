package com.company.demo.entity;

import com.haulmont.cuba.core.entity.annotation.Extends;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "extenduser_MyExtUser")
@Extends(User.class)
public class MyExtUser extends User {
    private static final long serialVersionUID = -1751380557926915677L;

    @Column(name = "address", length = 100)
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}