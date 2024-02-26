package com.tobeto.bootcampproject.business.abstracts.ınstructor;

import com.tobeto.bootcampproject.business.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcampproject.model.entities.Instructor;

public interface InstructorCreateService {
    Instructor create(
         final   InstructorCreateRequest instructorCreateRequest
    );
}
