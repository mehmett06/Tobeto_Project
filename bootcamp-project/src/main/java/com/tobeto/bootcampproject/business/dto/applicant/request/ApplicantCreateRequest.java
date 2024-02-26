package com.tobeto.bootcampproject.business.dto.applicant.request;

import com.tobeto.bootcampproject.business.dto.user.request.UserCreateRequest;
import lombok.Getter;

@Getter
public class ApplicantCreateRequest extends UserCreateRequest {
    private String about;
}
