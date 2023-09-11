package com.example.designpatterns1;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee("WEB");

//        Employee e1 = new AndroidDeveloper();

        System.out.println(e1.salary());
    }
}
