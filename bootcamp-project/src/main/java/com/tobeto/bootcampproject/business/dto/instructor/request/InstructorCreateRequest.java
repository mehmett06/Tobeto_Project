package com.tobeto.bootcampproject.business.dto.instructor.request;

import com.tobeto.bootcampproject.business.dto.user.request.UserCreateRequest;
import lombok.Getter;

@Getter

public class InstructorCreateRequest extends UserCreateRequest {
    private String companyName;
}
