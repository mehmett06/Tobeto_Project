package com.tobeto.bootcampproject.business.abstracts.employee;

import com.tobeto.bootcampproject.model.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getById(final Integer employeeId);
    List<Employee> getAll();
    Employee getEmployeeByPassword(
            final String password
    );
}
