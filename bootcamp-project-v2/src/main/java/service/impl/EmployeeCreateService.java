package service.impl;

import employeeCreateRequest.EmployeeCreateRequest;
import entities.Employee;

public interface EmployeeCreateService {
    Employee create(
        final EmployeeCreateRequest employeeCreateRequest
    );
}
