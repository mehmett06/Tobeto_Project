package controller;

import employeeCreateRequest.EmployeeCreateRequest;
import entities.Employee;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.impl.EmployeeCreateService;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private EmployeeCreateService employeeCreateService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(
        @RequestBody final EmployeeCreateRequest employeeCreateRequest
    )
    {
      final Employee createdEmployee =employeeCreateService
              .create(employeeCreateRequest);
      return ResponseEntity.ok(createdEmployee);
    }
}
