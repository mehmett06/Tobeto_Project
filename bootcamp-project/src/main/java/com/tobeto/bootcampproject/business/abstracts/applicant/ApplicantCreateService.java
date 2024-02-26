package com.tobeto.bootcampproject.business.abstracts.applicant;

import com.tobeto.bootcampproject.business.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcampproject.model.entities.Applicant;

public interface ApplicantCreateService {

    Applicant create( final ApplicantCreateRequest applicantCreateRequest);
}
