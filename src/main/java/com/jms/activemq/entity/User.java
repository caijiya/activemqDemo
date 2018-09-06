package com.jms.activemq.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 7168323545647862888L;
    private long id;
    private String userName;
    private int age;

    public User() {
    }

    public User(long id, String userName, int age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
