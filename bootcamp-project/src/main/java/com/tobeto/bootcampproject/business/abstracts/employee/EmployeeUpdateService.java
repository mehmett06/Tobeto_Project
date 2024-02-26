package com.tobeto.bootcampproject.business.abstracts.employee;

import com.tobeto.bootcampproject.business.dto.employee.request.EmployeeUpdateRequest;
import com.tobeto.bootcampproject.model.entities.Employee;

public interface EmployeeUpdateService {
    Employee updateEmployee(
            final Integer employeeId,
            final EmployeeUpdateRequest employeeUpdateRequest
    );
}
