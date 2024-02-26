package com.tobeto.bootcampproject.business.concretes.İmpl.Applicant;

import com.tobeto.bootcampproject.business.abstracts.applicant.ApplicantServiceUpdate;
import com.tobeto.bootcampproject.business.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.model.entities.Applicant;
import com.tobeto.bootcampproject.repositories.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicantUpdateServiceImpl implements ApplicantServiceUpdate {

    private final ApplicantRepository applicantRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Applicant update(Integer applicantId,
                            ApplicantUpdateRequest applicantUpdateRequest) {
        final Applicant applicantEntityToBeUpdate = applicantRepository
                .findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id değerine sahip bir Applicant bulunamadı."));

        applicantEntityToBeUpdate.setUserName(applicantUpdateRequest.getUserName());
        applicantEntityToBeUpdate.setFirstName(applicantUpdateRequest.getFirstName());
        applicantEntityToBeUpdate.setLastName(applicantUpdateRequest.getLastName());
        applicantEntityToBeUpdate.setDateOfBirthday(applicantUpdateRequest.getDateOfBirthday());
        applicantEntityToBeUpdate.setNationalIdentity(applicantUpdateRequest.getNationalIdentity());
        applicantEntityToBeUpdate.setEmail(applicantUpdateRequest.getEmail());
        applicantEntityToBeUpdate.setPassword(applicantUpdateRequest.getPassword());
        applicantEntityToBeUpdate.setAbout(applicantUpdateRequest.getAbout());

        return applicantRepository.save(applicantEntityToBeUpdate);

    }
}
