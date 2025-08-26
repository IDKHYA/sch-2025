package com.sch.springboot.dto;

public class Member {
    //field
    private String name;
    private int age;
    private String address;
    private String subject;

    //constructor
    public Member() {}

    //method : setter, getter

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //public void setName(String name) { this.name = name;}
}
