package com.tobeto.bootcampproject.model.dto.instructor.request;

import com.tobeto.bootcampproject.model.dto.user.request.UserCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

public class InstructorCreateRequest extends UserCreateRequest {
    private String companyName;

}
