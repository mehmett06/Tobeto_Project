package com.tobeto.bootcampproject.business.concretes.İmpl.Employee;

import com.tobeto.bootcampproject.business.abstracts.employee.EmployeeService;
import com.tobeto.bootcampproject.model.entities.Employee;
import com.tobeto.bootcampproject.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
 class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee getById(Integer employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Bu id'ye uygun Employee bulunamadı."));    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeByPassword(String password) {
        return employeeRepository
                .findEmployeeByPassword(password)
                .orElseThrow(() -> new RuntimeException("Böyle bir employee yok."));
    }
}
