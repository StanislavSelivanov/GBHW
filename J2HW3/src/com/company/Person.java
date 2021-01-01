package com.company;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<String> phone;

    public Person(String name, ArrayList<String> phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

}