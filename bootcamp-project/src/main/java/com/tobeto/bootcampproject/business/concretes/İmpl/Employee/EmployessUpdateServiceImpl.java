package com.tobeto.bootcampproject.business.concretes.İmpl.Employee;

import com.tobeto.bootcampproject.business.abstracts.employee.EmployeeUpdateService;
import com.tobeto.bootcampproject.business.dto.employee.request.EmployeeUpdateRequest;
import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.model.entities.Employee;
import com.tobeto.bootcampproject.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
 class EmployessUpdateServiceImpl implements EmployeeUpdateService {

    private  EmployeeRepository employeeRepository;
    private ModelMapperService modelMapperService;


    @Override
    public Employee updateEmployee(
            Integer employeeId,
            EmployeeUpdateRequest employeeUpdateRequest
    ) {
        Employee employeeToBeUpdate = employeeRepository
                .findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Id değeri bulunamadı."));

        modelMapperService
                .forRequest()
                .map(employeeUpdateRequest, employeeToBeUpdate);

        return employeeRepository.save(employeeToBeUpdate);
    }
}
