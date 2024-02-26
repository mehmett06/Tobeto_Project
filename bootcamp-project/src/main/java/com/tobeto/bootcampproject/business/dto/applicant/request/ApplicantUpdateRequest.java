package com.tobeto.bootcampproject.business.dto.applicant.request;

import com.tobeto.bootcampproject.business.dto.user.request.UserCreateUpdate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ApplicantUpdateRequest extends UserCreateUpdate {
private String about;
}
