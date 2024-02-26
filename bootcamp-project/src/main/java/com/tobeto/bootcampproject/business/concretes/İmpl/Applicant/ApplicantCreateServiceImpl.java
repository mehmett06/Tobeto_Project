package com.tobeto.bootcampproject.business.concretes.İmpl.Applicant;

import com.tobeto.bootcampproject.business.abstracts.applicant.ApplicantCreateService;
import com.tobeto.bootcampproject.business.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.model.entities.Applicant;
import com.tobeto.bootcampproject.repositories.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class ApplicantCreateServiceImpl implements ApplicantCreateService {
    private final ModelMapperService modelMapperService;
    private final ApplicantRepository applicantRepository;
    @Override
    public Applicant create(final ApplicantCreateRequest applicantCreateRequest) {
        Applicant applicantToBeSave=modelMapperService.forRequest().map(applicantCreateRequest,Applicant.class);
        return applicantRepository.save(applicantToBeSave);
    }
}
