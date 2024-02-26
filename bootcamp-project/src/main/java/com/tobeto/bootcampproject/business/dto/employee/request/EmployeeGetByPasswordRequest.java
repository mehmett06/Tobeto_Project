package com.tobeto.bootcampproject.business.dto.employee.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeGetByPasswordRequest {
    private String password;
}
