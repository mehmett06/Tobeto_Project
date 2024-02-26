package com.tobeto.bootcampproject.business.abstracts.applicant;

import com.tobeto.bootcampproject.business.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcampproject.model.entities.Applicant;

public interface ApplicantServiceUpdate {
    Applicant update(
            final Integer applicantId,
            final ApplicantUpdateRequest applicantUpdateRequest
            );
}
