package com.tobeto.bootcampproject.business.dto.instructor.request;

import com.tobeto.bootcampproject.business.dto.user.request.UserDeleteRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstructorCreateDelete extends UserDeleteRequest {
    private String companyName;
}
