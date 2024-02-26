package com.tobeto.bootcampproject.webApi.controllers;

import com.tobeto.bootcampproject.business.abstracts.applicant.ApplicantCreateService;
import com.tobeto.bootcampproject.business.abstracts.applicant.ApplicantService;
import com.tobeto.bootcampproject.business.abstracts.applicant.ApplicantServiceDelete;
import com.tobeto.bootcampproject.business.abstracts.applicant.ApplicantServiceUpdate;
import com.tobeto.bootcampproject.business.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcampproject.business.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcampproject.business.dto.applicant.response.ApplicantCreateResponse;
import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.model.entities.Applicant;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/applicants")
@RequiredArgsConstructor
public class ApplicantController {
    private final ApplicantCreateService applicantCreateService;
    private final ApplicantServiceDelete applicantDeleteService;
    private final ApplicantServiceUpdate applicantUpdateService;
    private final ApplicantService applicantService;
    private final ModelMapperService modelMapperService;

    @PostMapping
    public Applicant createApplicant(
            @RequestBody final ApplicantCreateRequest applicantCreateRequest
    ) {
        final Applicant createdApplicant = applicantCreateService
                .create(applicantCreateRequest);

        return createdApplicant;
    }

    @PutMapping("/{applicantId}")
    public Applicant updateApplicantById(
            @PathVariable("applicantId") final Integer applicantId,
            @RequestBody final ApplicantUpdateRequest applicantUpdateRequest
    ) {
        final Applicant updatedApplicant = applicantUpdateService
                .update(applicantId,applicantUpdateRequest);

        return updatedApplicant;
    }

    @DeleteMapping("/{applicantId}")
    public void deleteApplicant(
            @PathVariable("applicantId") final Integer applicantId
    ) {
        applicantDeleteService.delete(applicantId);
    }

    @GetMapping("/{applicantId}")
    public ApplicantCreateResponse getById(
            @PathVariable("applicantId") final Integer applicantId
    ) {
        Applicant applicant = applicantService.getById(applicantId);
        ApplicantCreateResponse applicantResponse = modelMapperService.forResponse()
                .map(applicant,ApplicantCreateResponse.class);
        return applicantResponse;

    }

    @GetMapping
    public List<Applicant> getAllApplicants(){
        return applicantService.getAllApplicants();
    }
}
