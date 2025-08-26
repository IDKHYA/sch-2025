package com.sch.springboot.dto;

public class Member {
    //field
    private String name;
    private int age;
    private String address;

    //constructor
    public Member() {}

    //method : setter, getter

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
