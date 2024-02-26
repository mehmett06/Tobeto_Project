package com.tobeto.bootcampproject.business.concretes.İmpl.Employee;


import com.tobeto.bootcampproject.business.abstracts.employee.EmployeeCreateService;
import com.tobeto.bootcampproject.business.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.model.entities.Employee;
import com.tobeto.bootcampproject.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

 class EmployeeCreateServiceImpl implements EmployeeCreateService {
     private final ModelMapperService modelMapperService;
     private final EmployeeRepository employeeRepository;
     @Override
    public Employee create(final EmployeeCreateRequest employeeCreateRequest) {
        Employee employeeToBeSave = modelMapperService.forRequest().map(employeeCreateRequest,Employee.class);
        return employeeRepository.save(employeeToBeSave);
    }
}

//model mapper gelen istekleri classa mapliyoruz bunları sonra repo ile kaydediyoruz.
//employee oluşturmak için method yazıyoruz gelen isteklere göre parametlerde yazdık
//employee entity içine yazmak istiyoruz
//bunun yerine model mapper ile yapıyoruz yazma işlemini