package com.io.Employee.EmployeeCURD.service;

import com.io.Employee.EmployeeCURD.model.Employee;
import com.io.Employee.EmployeeCURD.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee insertEmployee(Employee employee) {
        return employeeRepo.insertEmployee(employee);
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return employeeRepo.getEmployee(employeeId);
    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepo.getEmployeeList();
    }

    @Override
    public Employee updateEmployee(int employeeId, Employee employee) {
        return employeeRepo.updateEmployee(employeeId, employee);
    }

    @Override
    public String deleteEmployee(int employeeId) {
        return employeeRepo.deleteEmployee(employeeId);
    }
}