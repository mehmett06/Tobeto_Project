package com.tobeto.bootcampproject.business.concretes.İmpl.Applicant;

import com.tobeto.bootcampproject.business.abstracts.applicant.ApplicantServiceDelete;
import com.tobeto.bootcampproject.model.entities.Applicant;
import com.tobeto.bootcampproject.repositories.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicantDeleteServiceImpl implements ApplicantServiceDelete {
    private final ApplicantRepository applicantRepository;

    @Override
    public void delete(Integer applicantId) {
        final Applicant applicantEntityToBeDelete = applicantRepository
                .findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id değerine sahip bir Applicant bulunamadı."));

        applicantRepository.delete(applicantEntityToBeDelete);
    }
}
