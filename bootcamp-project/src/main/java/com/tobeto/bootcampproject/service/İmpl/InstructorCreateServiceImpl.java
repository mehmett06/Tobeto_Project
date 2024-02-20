package com.tobeto.bootcampproject.service.İmpl;

import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.dataAccess.InstructorRepository;
import com.tobeto.bootcampproject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcampproject.model.entities.Instructor;
import com.tobeto.bootcampproject.service.InstructorCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor//gerekli alanları kullanarak constructor oluşturuyor.
public class InstructorCreateServiceImpl implements InstructorCreateService {

    private final InstructorRepository instructorRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Instructor create(
           final InstructorCreateRequest instructorCreateRequest
    ) {
        final Instructor instructorToBeSave=modelMapperService.forRequest()
                .map(instructorCreateRequest,Instructor.class);

        return instructorRepository.save(instructorToBeSave);
    }
}
