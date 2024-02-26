package com.tobeto.bootcampproject.business.abstracts.employee;

import com.tobeto.bootcampproject.business.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcampproject.model.entities.Employee;

public interface EmployeeCreateService {
    Employee create(
            final EmployeeCreateRequest employeeCreateRequest
    );
}
