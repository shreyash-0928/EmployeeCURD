package com.io.Employee.EmployeeCURD.repo;

import com.io.Employee.EmployeeCURD.model.Employee;

import java.util.List;

public interface EmployeeRepo {
    Employee insertEmployee(Employee employee);

    Employee getEmployee(int employeeId);

    List<Employee> getEmployeeList();

    Employee updateEmployee(int employeeId, Employee employee);

    String deleteEmployee(int employeeId);

}
