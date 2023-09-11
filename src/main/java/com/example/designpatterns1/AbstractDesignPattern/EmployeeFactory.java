package com.example.designpatterns1.AbstractDesignPattern;

public class EmployeeFactory {
    //get the employee
    public static Employee getEmployee(AbstractEmployeeFactory factory){
        return factory.createEmployee();
    }
}
