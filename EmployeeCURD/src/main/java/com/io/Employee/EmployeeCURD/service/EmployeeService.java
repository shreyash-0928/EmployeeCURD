package com.io.Employee.EmployeeCURD.service;

import com.io.Employee.EmployeeCURD.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee insertEmployee(Employee employee);

    Employee getEmployee(int employeeId);

    List<Employee> getEmployeeList();

    Employee updateEmployee(int employeeId, Employee employee);

    String deleteEmployee(int employeeId);
}


