package com.io.Employee.EmployeeCURD.repo;

import com.io.Employee.EmployeeCURD.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public Employee insertEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
        return employee;
    }

    @Override
    public Employee getEmployee(int employeeId) {
        return employeeMap.get(employeeId);
    }

    @Override
    public List<Employee> getEmployeeList() {
        return new ArrayList<>(employeeMap.values());
    }

    @Override
    public Employee updateEmployee(int employeeId, Employee employee) {
        if (employeeMap.containsKey(employeeId)) {
            employeeMap.put(employeeId, employee);
            return employee;
        }
        return null;
    }

    @Override
    public String deleteEmployee(int employeeId) {
        employeeMap.remove(employeeId);
        return "Employee deleted successfully";
    }
}