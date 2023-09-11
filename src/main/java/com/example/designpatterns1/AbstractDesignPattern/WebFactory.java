package com.example.designpatterns1.AbstractDesignPattern;

public class WebFactory extends AbstractEmployeeFactory{


    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
