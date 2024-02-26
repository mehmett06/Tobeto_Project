package com.tobeto.bootcampproject.business.dto.employee.request;

import com.tobeto.bootcampproject.business.dto.user.request.UserCreateUpdate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeUpdateRequest extends UserCreateUpdate {
    private String position;
}
