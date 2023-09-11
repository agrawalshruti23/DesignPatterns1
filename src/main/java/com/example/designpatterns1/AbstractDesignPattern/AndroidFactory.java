package com.example.designpatterns1.AbstractDesignPattern;

public class AndroidFactory extends AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
