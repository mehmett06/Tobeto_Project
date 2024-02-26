package com.tobeto.bootcampproject.business.abstracts.applicant;

import com.tobeto.bootcampproject.model.entities.Applicant;

import java.util.List;

public interface ApplicantService {
    Applicant getById(final Integer applicantId);

    List<Applicant> getAllApplicants();
}
