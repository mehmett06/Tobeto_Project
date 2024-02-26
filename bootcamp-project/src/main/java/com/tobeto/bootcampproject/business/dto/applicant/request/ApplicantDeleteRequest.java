package com.tobeto.bootcampproject.business.dto.applicant.request;

import com.tobeto.bootcampproject.business.dto.user.request.UserDeleteRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantDeleteRequest extends UserDeleteRequest {
    private String about;
}
