package com.tobeto.bootcampproject.webApi.controllers;


import com.tobeto.bootcampproject.business.abstracts.employee.EmployeeCreateService;
import com.tobeto.bootcampproject.business.abstracts.employee.EmployeeDeleteService;
import com.tobeto.bootcampproject.business.abstracts.employee.EmployeeService;
import com.tobeto.bootcampproject.business.abstracts.employee.EmployeeUpdateService;
import com.tobeto.bootcampproject.business.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcampproject.business.dto.employee.request.EmployeeGetByPasswordRequest;
import com.tobeto.bootcampproject.business.dto.employee.request.EmployeeUpdateRequest;
import com.tobeto.bootcampproject.model.entities.Employee;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Json'dan gelen istekleri kabul et
@AllArgsConstructor//Gerekli olan tüm constructor sınıfları oluştur
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeCreateService employeeCreateService;
    private final EmployeeDeleteService employeeDeleteService;
    private final EmployeeUpdateService employeeUpdateService;
    private final EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(
            @RequestBody final EmployeeCreateRequest employeeCreateRequest
    ) {
        final Employee createdEmployee = employeeCreateService.create(employeeCreateRequest);
        return createdEmployee;

    }


    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeById(
            @PathVariable("employeeId") final Integer employeeId
    )
    {

        return employeeService.getById(employeeId);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAll();
    }
    @PutMapping("/employee/{employeeId}")
    public Employee updateEmployeeById(
            @PathVariable("employeeId") final Integer employeeId,// gideceği yolu gösteriyoruz
            @RequestBody final EmployeeUpdateRequest employeeUpdateRequest
    )
    {
        final Employee updatedEmployee = employeeUpdateService
                .updateEmployee(employeeId,employeeUpdateRequest);
        //ıd veriyoruz kendi ordan bulup

        return updatedEmployee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public void deleteEmployee(
            @PathVariable("employeeId") final Integer employeeId
    ){
        employeeDeleteService.deleteEmployeeById(employeeId);
    }

    @GetMapping("/password")
    public Employee getEmployeeById(
            @RequestBody final EmployeeGetByPasswordRequest employeeGetByPasswordRequest
            ) {
        return employeeService.getEmployeeByPassword(employeeGetByPasswordRequest.getPassword());
    }

}
