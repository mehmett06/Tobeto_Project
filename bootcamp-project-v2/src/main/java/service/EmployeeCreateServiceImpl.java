package service;

import dataccess.EmployeeRepository;
import employeeCreateRequest.EmployeeCreateRequest;
import entities.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import service.impl.EmployeeCreateService;
import lombok.Builder;



import javax.swing.text.html.parser.Entity;

@Service
@RequiredArgsConstructor
@Builder

public class EmployeeCreateServiceImpl implements EmployeeCreateService {

    private final EmployeeRepository employeeRepository;
    @Override
    public Employee create(
           final EmployeeCreateRequest employeeCreateRequest)
    {
        final Employee employeeToBeSave = Employee.builder()
                .username(employeeCreateRequest.getUserCreateRequest().getUsername())
                .firstName(employeeCreateRequest.getUserCreateRequest().getFirstName())
                .lastName(employeeCreateRequest.getUserCreateRequest().getLastName())
                .dateOfBirth(employeeCreateRequest.getUserCreateRequest().getDateOfBirth())
                .nationalIdentity(employeeCreateRequest.getUserCreateRequest().getNationalIdentity())
                .email(employeeCreateRequest.getUserCreateRequest().getEmail())
                .password(employeeCreateRequest.getUserCreateRequest().getPassword())
                .build();
        return  employeeRepository.save(employeeToBeSave);
    }
}
