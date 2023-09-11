package com.example.designpatterns1.AbstractDesignPattern;



public class WebDeveloper implements Employee {

    public int salary() {
        System.out.println("Getting Web Developer Salary");
        return 50000;
    }

    public String name() {
        return "WebDeveloper";
    }
}
