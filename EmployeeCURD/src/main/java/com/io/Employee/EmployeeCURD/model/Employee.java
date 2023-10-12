package com.io.Employee.EmployeeCURD.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int employeeId;
    private String employeeName;
    private int deptNo;
    private String email;
    private String address;
    private double salary;
}
