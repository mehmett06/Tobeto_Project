package com.tobeto.bootcampproject.business.dto.employee.request;

import com.tobeto.bootcampproject.business.dto.user.request.UserDeleteRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDeleteRequest extends UserDeleteRequest {
    private String position;
}
