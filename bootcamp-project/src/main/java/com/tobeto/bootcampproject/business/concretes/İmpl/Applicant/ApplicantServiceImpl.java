package com.tobeto.bootcampproject.business.concretes.İmpl.Applicant;

import com.tobeto.bootcampproject.business.abstracts.applicant.ApplicantService;
import com.tobeto.bootcampproject.model.entities.Applicant;
import com.tobeto.bootcampproject.repositories.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ApplicantServiceImpl implements ApplicantService {
    private final ApplicantRepository applicantRepository;

    @Override
    public Applicant getById(Integer applicantId) {
        return applicantRepository.findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id'ye sahip bir applicant bulunamadı.") );

    }

    @Override
    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();    }
}
