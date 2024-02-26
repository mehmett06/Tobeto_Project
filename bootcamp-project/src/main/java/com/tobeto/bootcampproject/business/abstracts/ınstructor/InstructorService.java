package com.tobeto.bootcampproject.business.abstracts.ınstructor;

import com.tobeto.bootcampproject.model.entities.Instructor;

import java.util.List;

public interface InstructorService {
    Instructor getById(final Integer instructorId);
    List<Instructor> getAllInstructors();
}
