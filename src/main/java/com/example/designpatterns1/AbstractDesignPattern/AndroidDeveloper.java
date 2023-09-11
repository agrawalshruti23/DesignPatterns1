package com.example.designpatterns1.AbstractDesignPattern;



public class AndroidDeveloper implements Employee {

    public int salary() {
        System.out.println("Getting Android Developer Salary");
        return 10000;
    }


    public String name() {
        return "AndroidDeveloper";
    }
}
