package com.tobeto.bootcampproject.business.concretes.İmpl.Employee;

import com.tobeto.bootcampproject.business.abstracts.employee.EmployeeDeleteService;
import com.tobeto.bootcampproject.model.entities.Employee;
import com.tobeto.bootcampproject.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
 class EmployeeDeleteServiceImpl implements EmployeeDeleteService {
    private final EmployeeRepository employeeRepository;
    @Override
    public void deleteEmployeeById(Integer employeeId) {
        employeeRepository.deleteById(employeeId);

    }
}
//public silme amacım artık başka yerde görmüyorum.