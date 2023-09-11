package com.example.designpatterns1.AbstractDesignPattern;

public class Client {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidFactory());

        System.out.println(e1.name());
    }
}
